import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingClass {

    @Test
    void formattedTest(){
        Telephone telephone = new Telephone();
        assertTrue(telephone.isFormatted("(123)456-7890"));
    }

    @Test
    void correctFormat(){
        Telephone telephone = new Telephone();
        assertEquals("(123)456-7890",telephone.format("1234567890"));
    }

    @Test
    void unformatTest(){
        Telephone telephone = new Telephone();
        assertEquals("1234567890",telephone.unformat("(123)456-7890"));
    }
}
