package production;

import java.util.Objects;
import java.util.regex.*;

//入力検証ロジック（itemCodeの形式チェック）
public class ItemValidator {
    //itemCodeのパターンを生成
    private static final Pattern ITEMCODE_PATTERN = Pattern.compile("([A-Z])-(\\d{4})");

    //形式チェック用メソッド
    public void validate(String itemCode){
        Objects.requireNonNull(itemCode, "itemCodeがnullです");
        Matcher match = ITEMCODE_PATTERN.matcher(itemCode);
        if(!match.matches()){
            throw new IllegalArgumentException("不正な形式です");
        }
    }
}
