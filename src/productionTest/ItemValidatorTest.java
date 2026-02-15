package productionTest;

import org.junit.jupiter.api.Test;
import production.ItemValidator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemValidatorTest {

    private ItemValidator validator = new ItemValidator();

    @Test//正しい形式での処理
    void validate_ShouldNotThrowException_WhenFormatIsValid(){
        assertDoesNotThrow(()-> validator.validate("C-0029"));
    }

    @Test//nullののときNullPointerExceptionが投げられる
    void validate_ShouldThrowNpe_WhenInputIsNull(){
        assertThrows(NullPointerException.class,()-> validator.validate(null));
    }

    @Test//不正な形式の入力での処理 1
    void validate_ShouldThrowIae_WhenFormatIsInvalid_ver1(){
        assertThrows(IllegalArgumentException.class,()-> validator.validate("K-001"));
    }

    @Test//不正な形式の入力での処理 2
    void validate_ShouldThrowIae_WhenFormatIsInvalid_ver2(){
        assertThrows(IllegalArgumentException.class,()-> validator.validate("K0029"));
    }

    @Test//不正な形式の入力での処理 3
    void validate_ShouldThrowIae_WhenFormatIsInvalid_ver3(){
        assertThrows(IllegalArgumentException.class,()-> validator.validate("AB-0029"));
    }

    @Test//不正な形式の入力での処理 4
    void validate_ShouldThrowIae_WhenFormatIsInvalid_ver4(){
        assertThrows(IllegalArgumentException.class,()-> validator.validate("k-0029"));
    }




}
