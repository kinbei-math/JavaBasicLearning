package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultCalculator {

    //compileは動作が重いので関数を回す前に先に作っておく。
    // static final 定数は_と大文字で構成
    private static final Pattern EXPRESSION_PATTERN = Pattern.compile("(\\d+)([-+*/])(\\d+)");//数字列(\\d+),演算子,数字列(\\d+)のパターンを作成


    //公開 戻り値の型(interface, 成功or失敗) メソッド名 引数
    public CalculationResult calculate(String input){

        //中身がnullなら受け渡しミス。内部バグ
        if(input == null){
            return new CalculationResult.Failure(CalculationResult.ErrorCode.INTERNAL_ERROR);
        }
        // 文字列を整理 input_deln の意味が弱い修正→brankdelete→withoutWhitespace
        String withoutWhitespace = input.replaceAll("\\s+","");//Stringクラスの関数を使って空白(\\n)削除 これも少し重い？

        Matcher match = EXPRESSION_PATTERN.matcher(withoutWhitespace);//このパターンでグループ化
        if(!match.matches())//inputしたものが上のパターンに適しているかを調べる。
        {
            return new CalculationResult.Failure(CalculationResult.ErrorCode.INVALID_EXPRESSION);//適していなければ「式が不正」であるとエラーを出す。
        }

        //計算の準備　変換エラーが出れば途中で止まる。
        int left = Integer.parseInt(match.group(1));//1つめを数値変換
        String operator = match.group(2);//演
        // 算子を代入
        int right = Integer.parseInt(match.group(3));//2つめを数値変換

        //演算を実行
        switch (operator){
            case "+":return new CalculationResult.Success(left+right);// 和
            case "-":return new CalculationResult.Success(left-right);// 差
            case "*":return new CalculationResult.Success(left*right);// 積
            case "/":{
                if(right==0){
                    return new CalculationResult.Failure(CalculationResult.ErrorCode.DIVISION_BY_ZERO);//0で割ってる場合エラー
                }else{
                    return new CalculationResult.Success(left/right);// 商
                }
            }
            default:return new CalculationResult.Failure(CalculationResult.ErrorCode.INTERNAL_ERROR);//想定外の演算子がきてる。本来到達しない。
        }
    }
}
