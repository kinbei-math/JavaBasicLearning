package productionTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import production.Item;
import production.ItemManager;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class ItemManagerTest {

    private ItemManager itemManager;
    private Item item1;
    private Item item2;

    @BeforeEach//何度も繰り返す使う設定や初期化が必要な処理をテストの前に実行するメソッド
    void setUp() { // メソッドはメソッドの中でしか使えない。
        itemManager = new ItemManager();
        item1 = new Item("K-0029", "ネジ", 500);
        item2 = new Item("K-0030", "ボルト", 500);
        itemManager.addItem(item1);
        itemManager.addItem(item2);
    }

    @Test//登録済みのものを正しく取得できる
    void getItem_ShouldReturnItem_WhenCodeIsRegistered(){
        assertEquals(item1, itemManager.getItem("K-0029"));
        assertEquals(item2, itemManager.getItem("K-0030"));
    }

    @Test//未登録のコードは例外を投げる
    void getItem_ShouldThrowNoSuchElementException_WhenCodeDoesNotExist(){
        assertThrows(NoSuchElementException.class,()-> itemManager.getItem("K-0031"));
    }

    @Test//全アイテムが返ることを確認
    void getAllItems_shouldReturnAllItems_whenItemsAreRegistered(){
        List<Item> itemListALLItems = itemManager.getAllItems();
        assertEquals(2,itemListALLItems.size());
        assertTrue(itemListALLItems.contains(item1));
        assertTrue(itemListALLItems.contains(item2));
    }

    @Test//空のリストが返ることを確認
    void getAllItems_shouldReturnEmptyList_whenNoItemsAreRegistered(){
        ItemManager emptyManager = new ItemManager();
        assertTrue(emptyManager.getAllItems().isEmpty());
    }

    @Test//Mapのsafetystockのsumがしっかり計算されていることを確認
    void getTotalSafetyStock_shouldReturnSumOfSafetyStock_whenItemsAreRegistered(){
        assertEquals(1000,itemManager.getTotalSafetyStock());
    }

    @Test //Mapが空なら0になることを確認
    void getTotalSafetyStock_shouldReturn0_whenNoItemsAreRegistered(){
        ItemManager emptyManager = new ItemManager();
        assertEquals(0,emptyManager.getTotalSafetyStock());
    }

}
