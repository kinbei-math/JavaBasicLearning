package production;
import java.util.Objects;

//ドメインオブジェクト（品目情報のみ）
public class Item {
    private final String itemCode;//品目コード
    private final String name;//品名
    private final Integer safetyStock;//安全在庫

    //コンストラクタ　finalで定義する場合必須
    public Item(String itemCode,String name,Integer safetyStock){
        this.itemCode = itemCode;
        this.name = name;
        this.safetyStock = safetyStock;
    }

    @Override//recordのequalsを書き換え
    public boolean equals(Object obj){
        if(obj instanceof Item items){
            return this.itemCode.equals(items.itemCode);
        }else{
            return false;
        }
    }

    @Override//ハッシュ値の計算を書き換え。itemCodeで真偽判定するので、それを用いてハッシュ値を生成
    public int hashCode(){
        return Objects.hash(this.itemCode);
    }

    @Override//toStringの書き換え。Itemクラスのインスタンスが持つ情報を表示させる。
    public String toString(){
        String display;
        if(this.safetyStock==null){
            display = "なし";
        }else{
            display = String.valueOf(this.safetyStock);
        }
        return "Item[itemCode="+this.itemCode+", name="+this.name+", safetystock="+display+"]";
    }
}

