package exceptionTest;

import exception.CalculationResult;
import exception.ResultCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ResultCalculateTest {

    //テスト用にResultクラスのインスタンス作成
    ResultCalculator calc = new ResultCalculator();

    @Test
    void shouldResult12_whenSpaces() {//スペース付き演算
        //result(名前)の箱に結果をいれる。Succes or Failuer
        CalculationResult result = calc.calculateresult("10 + 2");
        //検証用のデータをその場で作って検証する。中身まで検証される。
        assertEquals(new CalculationResult.Success(12), result);
    }
}
