package exceptionTest;
import static org.junit.jupiter.api.Assertions.*;
import exception.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void calculatorTest(){// 通常の演算
        assertEquals(12,calc.calculator("10+2"));
    }
    @Test
    void SpacecTest(){//スペース付き演算
        assertEquals(12,calc.calculator("10 + 2"));
    }
    @Test
    void ArithmeticExceptionTest() {//0除算
        assertThrows(ArithmeticException.class, () -> {
            calc.calculator("10/0");
        });
    }
    @Test
    void operatorTest() {//演算子不明
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculator("10?2");
        });
    }
    @Test
    void NotMacthTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculator("10+");
        });
    }
    @Test
    void invalidexpessionTest(){// 通常の演算
        assertThrows(IllegalArgumentException.class,()->{calc.calculator("10++2");});
    }

}
