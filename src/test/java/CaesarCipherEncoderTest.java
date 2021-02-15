import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaesarCipherEncoderTest {

    CaesarCipherEncoder caesarCipherEncoder;
    String sourceOne;
    String sourceTwo;
    String sourceThree;
    int shift;
    String expectedOne;
    String expectedTwo;
    String expectedThree;

    @BeforeEach
    void setUp() {
        caesarCipherEncoder = new CaesarCipherEncoder();
        sourceOne = "Java - язык программирования №1 в мире. Ну, IMHO, !@#$%^& 123";
        sourceTwo = "";
        sourceThree = null;
        shift = 4;
        expectedOne = "Neze - гляо уфтжфдррмфтёдсмг №1 ё рмфи. Сч, MQLS, !@#$%^& 123";
        expectedTwo = "";
        expectedThree = "Введено значение null";
    }

    @Test
    void encrypt() {
        Assertions.assertEquals(caesarCipherEncoder.encrypt(sourceOne, shift), expectedOne);
        Assertions.assertEquals(caesarCipherEncoder.encrypt(sourceTwo, shift), expectedTwo );
        Assertions.assertEquals(caesarCipherEncoder.encrypt(sourceThree, shift), expectedThree );


    }

    @Test
    void decrypt() {
        Assertions.assertEquals(caesarCipherEncoder.decrypt(expectedOne, shift), sourceOne);
    }
}