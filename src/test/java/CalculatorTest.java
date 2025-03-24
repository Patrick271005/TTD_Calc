import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator myCalc;
    @BeforeEach
    void setup()
    {
        myCalc =new Calculator();
    }
    @Test
    void testAddSuccess()
    {
        assertEquals(8,myCalc.add(4,4));
    }
    @Test
    void testAddFail()
    {
        Exception ex=assertThrows(IllegalArgumentException.class,()->{myCalc.add(Integer.MAX_VALUE,4);});
        assertEquals("Input is too large", ex.getMessage());
    }
    @Test
    void testSubSuccess()
    {
        assertEquals(4,myCalc.sub(6,2));
    }
    @Test
    void testSubFail()
    {
        Exception ex=assertThrows(IllegalStateException.class,()->{myCalc.sub(Integer.MIN_VALUE,2);});
        assertEquals("Input cannot be negative", ex.getMessage());
    }



}
