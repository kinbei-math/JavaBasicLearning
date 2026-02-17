package production;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


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

    public List<Item> getAllItems(){
        return List.copyOf(itemMap.values());
    }

/*    public int getTotalSafetyStock(){//ループ版
        int sum=0;
        List<Item> items = getAllItems();
        for(int i=0;i<items.size();i++){
            sum += items.get(i).getSafetyStock();
        }
        return sum;
    }
 */

    public int getTotalSafetyStock(){//Stream版
        return getAllItems().stream()
                .mapToInt(Item::getSafetyStock)
                .sum();
        //(データ).stream()は(データ)の集合に対してstream機能を使うよという宣言
        //mapToInt mapの値をIntに変換 Item::メソッド名　Itemクラスの○○メソッドを使うという宣言
        //sum() 和を求めるという終端操作
        //リストから使うときはimport不要。型として宣言、Collectorsなどのようにクラス名直接書く場合は必要
    }

    public List<Item> getItemsBelowSafetyStock(int currentStock){//在庫数が安全在庫より少ないものを返すリスト
        return getAllItems().stream()
                .filter(item->item.getSafetyStock()>currentStock)
                .toList();
    }

    public Map<String, List<Item>> groupByCategory(){
        return getAllItems().stream()
                .collect(Collectors.groupingBy(Item::getCategory));
    }

    public void exportToCsv(String filePath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for(Item item:getAllItems()){
                writer.write(String.join(",",item.getItemCode(),item.getName(),String.valueOf(item.getSafetyStock()),item.getCategory()));
                writer.newLine();
            }
        }catch(IOException e){
            // 「想定内のトラブル（IOException）」を、
            // 「致命的な異常事態（RuntimeException）」に変換して投げ直している
            throw new RuntimeException("予期せぬ書き込みエラーが発生しました", e);
        }
    }

    public Optional<Item> findItem(String itemCode){//Optional(nullでもよい箱)を使って検索を簡略化
        return Optional.ofNullable(itemMap.get(itemCode));
    }
}
