package exceptionTest;

import exception.CalculationResult;
import exception.ResultCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ResultCalculatorTest {

    //テスト用にResultクラスのインスタンス作成
    ResultCalculator calc = new ResultCalculator();

    @Test
    void shouldResult12_whenSpaces() {//スペース付き演算
        //result(名前)の箱に結果をいれる。Succes or Failuer
        CalculationResult resultWhenSpaces = calc.calculate("10 + 2");
        //検証用のデータをその場で作って検証する。中身まで検証される。
        assertEquals(new CalculationResult.Success(12), resultWhenSpaces);
    }

    @Test
    void shouldResult12_whenNoSpaces() {
        CalculationResult resultWhenNoSpaces = calc.calculate("10+2");
        assertEquals(new CalculationResult.Success(12), resultWhenNoSpaces);
    }


    @Test
    void shouldResultError_whenDivisionByZero() {//0除算
        CalculationResult resultWhenDivisionByZero = calc.calculate("10/0");

        // Failureの型かをチェックしてfに代入
        // 型,変数名 = 判定(class,判定したいオブジェクト)　判定が失敗すれば下まで降りない。
        CalculationResult.Failure f = assertInstanceOf(CalculationResult.Failure.class,resultWhenDivisionByZero);

        // fにreslutWhenDivishonByZeroを代入
        assertEquals(CalculationResult.ErrorCode.DIVISION_BY_ZERO, f.code());
        assertEquals("Division by zero", f.code().getMessage());
    }



    @Test
    void shouldResultInvalidExpression_whenIncompleteExpression() {
        CalculationResult resultWhenIncompleteExpression = calc.calculate("10+");

        CalculationResult.Failure f = assertInstanceOf(CalculationResult.Failure.class,resultWhenIncompleteExpression);

        assertEquals(CalculationResult.ErrorCode.INVALID_EXPRESSION, f.code());
        assertEquals("invalid expression", f.code().getMessage());
    }

    @Test
    void shouldResultError_whenOperatorUnknown() {
        CalculationResult resultWhenOperatorUnknown = calc.calculate("10?2");
        assertEquals(new CalculationResult.Failure(CalculationResult.ErrorCode.INVALID_EXPRESSION), resultWhenOperatorUnknown);
    }

    @Test
    void shouldResultError_whenDoubleOperator() {// 演算子異常
        CalculationResult resultWhenDoubleOperator = calc.calculate("10++2");
        assertEquals(new CalculationResult.Failure(CalculationResult.ErrorCode.INVALID_EXPRESSION), resultWhenDoubleOperator);
    }

    @Test
    void shouldResultError_whenNegativeNumber1() {
        CalculationResult resultWhenNegativeNumber1 = calc.calculate("10+-2");
        assertEquals(new CalculationResult.Failure(CalculationResult.ErrorCode.INVALID_EXPRESSION), resultWhenNegativeNumber1);
    }

    @Test
    void shouldResultError_whenNegativeNumber2() {
        CalculationResult resultWhenNegativeNumber2 = calc.calculate("-10+2");
        assertEquals(new CalculationResult.Failure(CalculationResult.ErrorCode.INVALID_EXPRESSION), resultWhenNegativeNumber2);
    }

    @Test
    void shouldResultError_whenNull() {
        CalculationResult resultWhenNull = calc.calculate(null);

        CalculationResult.Failure f = assertInstanceOf(CalculationResult.Failure.class,resultWhenNull);

        assertEquals(CalculationResult.ErrorCode.INTERNAL_ERROR, f.code());
        assertEquals("internal error", f.code().getMessage());
    }
}
