package productionTest;

import org.junit.jupiter.api.Test;
import production.Item;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ItemCodeTest {

    @Test //同じ商品コードなら等価と判定されること
    void equals_ShouldReturnTrue_WhenItemCodesAreEqual(){
        Item item1 = new Item("No.1","ボルト",1000,"ネジ");
        Item item2 = new Item("No.1","ボルト 改造",500,"ネジ");
        assertEquals(item1, item2);
    }

    @Test //異なる商品コードなら非等価と判定されること
    void equals_ShouldReturnFalse_WhenItemCodesAreDifferent(){
        Item item1 = new Item("No.1","ボルト",1000,"ネジ");
        Item item2 = new Item("No.2","ボルト",1000,"ネジ");
        assertNotEquals(item1, item2);
    }

    @Test //HashSet(重複のない単一データ保管庫)でhashCode()がitemCodeに紐づいているかを確認する
    void hashSet_ShouldRemoveDuplicate_WhenItemCodesAreEqual(){//Itemクラスで定義したhashCode(),equals()を参照している。
        Item item1 = new Item("No.1","ボルト",1000,"ネジ");
        Item item2 = new Item("No.1","ボルト 改造",500,"ネジ");
        Set<Item> itemCodes = new HashSet<>();//ItemクラスをSet(インターフェイス), HashSet<>は<Item>が省略
        itemCodes.add(item1);//item1を追加
        itemCodes.add(item2);//item2は追加できない。

        assertEquals(1,itemCodes.size());//item1しか追加されていないことを確認

    }

    @Test//HashMap(重複のない対応関係)でitemCodeから値を取り出す。
    void hashMap_ShouldRetrieveValue_WhenUsingEqualKey(){
        Map<Item,String> items = new HashMap<>();//確認用のMap作成
        Item item1 = new Item("No.1","ボルト",1000,"ネジ");
        Item item2 = new Item("No.1","ボルト",1000,"ネジ");

        items.put(item1,"在庫あり");//item1のオブジェクトを登録

        assertEquals("在庫あり",items.get(item2));//item2のオブジェクトで引き出す。本来なら別オブジェクトだがequalsとhashCodeのOverrideのおかげで一致。
    }

}
