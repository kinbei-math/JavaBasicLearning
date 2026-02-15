package production;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

//品目管理ロジック（HashMapでの登録/検索）
public class ItemManager {
    //フィールドにMapを作成。メソッドではなく、クラス単位で管理
    private final Map<String, Item> itemMap = new HashMap<>();

    //追加メソッド
    public void addItem(Item item){
        itemMap.put(item.getItemCode(), item);
    }

    //検索メソッド
    public Item getItem(String itemCode){
        Item checkItem = itemMap.get(itemCode);
        if(checkItem == null) {
            throw new NoSuchElementException("この品目コードのItemは存在しません。");
        }
        return checkItem;
    }
}
