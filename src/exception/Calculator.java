package exception;
import java.util.regex.*;

public class Calculator{
    //compileは動作が重いので関数を回す前に先に作っておく。
    private static final Pattern pattern = Pattern.compile("(\\d+)([-+*/])(\\d+)");//数字列(\\d+),演算子,数字列(\\d+)のパターンを作成
    public int calculate(String input) {//ロジック層　動詞ぽい名前に設定しなおし→calculateメソッドに
        // 文字列を整理 input_deln の意味が弱い修正→brankdelete→withoutWhitespace
        String withoutWhitespace =input.replaceAll("\\s+","");//Stringクラスの関数を使って空白(\\n)削除

        //文字列を分解　static finalで命名する
        Matcher match = pattern.matcher(withoutWhitespace);//このパターンでグループ化
        if(!match.matches())//inputしたものが上のパターンに適しているかを調べる。
        {throw new IllegalArgumentException("invalid expression");}//適していなければ「式が不正」であるとエラーを出す。

        //計算の準備　変換エラーが出れば途中で止まる。
        int left = Integer.parseInt(match.group(1));//1つめを数値変換
        String operator = match.group(2);//演算子を代入
        int right = Integer.parseInt(match.group(3));//2つめを数値変換

        //演算を実行
        switch (operator){
            case "+":return left+right;// 和
            case "-":return left-right;// 差
            case "*":return left*right;// 積
            case "/":{
                if(right==0){
                    throw new ArithmeticException("Division by zero");//0で割ってる場合エラー
                }else{
                    return left/right;// 商
                }
            }
            default:throw new IllegalStateException("invalid expression");//例外はすべてエラーで返す。
        }
    }
}

