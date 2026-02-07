package exceptionTest;
import static org.junit.jupiter.api.Assertions.*;
import exception.Calculator;
import org.junit.jupiter.api.Test;

class CalculateTest {
    Calculator calc = new Calculator();
    private static final String ERROR1= "invalid expression";
    private static final String ERROR2= "Division by zero";
    @Test
    void shouldResult2_whenNoSpaces() {// 通常の演算
        assertEquals(12, calc.calculate("10+2"));
    }

    @Test
    void shouldResult12_whenSpaces() {//スペース付き演算
        assertEquals(12, calc.calculate("10 + 2"));
    }

    @Test
    void shouldResultEROOR2_whenDivisionByZero() {//0除算
        ArithmeticException exception_DivisionByZero = assertThrows(ArithmeticException.class, () -> calc.calculate("10/0"));
        assertEquals(ERROR2, exception_DivisionByZero.getMessage());
    }

    @Test
    void shouldResulutInvalidExpression_whenRightNotClear() {
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("10+"));
        assertEquals(ERROR1, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultEROOR1_whenOperatorClear1() {//演算子不明
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("10?2"));
        assertEquals(ERROR1, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultEROOR1_whenOperatorNotClear2() {// 演算子異常
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("10++2"));
        assertEquals(ERROR1, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultEROOR1_whenNegativeNumber1(){
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("1+-2"));
        assertEquals(ERROR1, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultEROOR1_whenNegativeNumber2(){
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("-1+2"));
        assertEquals(ERROR1, exception_invalidexpression.getMessage());
    }
}

