package exceptionTest;
import static org.junit.jupiter.api.Assertions.*;
import exception.Calculator;
import org.junit.jupiter.api.Test;

class CalculateTest {
    Calculator calc = new Calculator();
    private static final String ERROR_INVALID = "invalid expression";
    private static final String ERROR_DIVIDE_BY_ZERO= "Division by zero";
    @Test
    void shouldResult12_whenNoSpaces() {// 通常の演算
        assertEquals(12, calc.calculate("10+2"));
    }

    @Test
    void shouldResult12_whenSpaces() {//スペース付き演算
        assertEquals(12, calc.calculate("10 + 2"));
    }

    @Test
    void shouldResultError_whenDivisionByZero() {//0除算
        ArithmeticException exception_DivisionByZero = assertThrows(ArithmeticException.class, () -> calc.calculate("10/0"));
        assertEquals(ERROR_DIVIDE_BY_ZERO, exception_DivisionByZero.getMessage());
    }

    @Test
    void shouldResultInvalidExpression_whenIncompleteExpression() {
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("10+"));
        assertEquals(ERROR_INVALID, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultError_whenOperatorUnknown() {//演算子不明
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("10?2"));
        assertEquals(ERROR_INVALID, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultError_whenRightOperandIsNegative() {// 演算子異常
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("10++2"));
        assertEquals(ERROR_INVALID, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultEroor_whenNegativeNumber1(){
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("1+-2"));
        assertEquals(ERROR_INVALID, exception_invalidexpression.getMessage());
    }

    @Test
    void shouldResultError_whenNegativeNumber2(){
        IllegalArgumentException exception_invalidexpression = assertThrows(IllegalArgumentException.class, () -> calc.calculate("-1+2"));
        assertEquals(ERROR_INVALID, exception_invalidexpression.getMessage());
    }
}

