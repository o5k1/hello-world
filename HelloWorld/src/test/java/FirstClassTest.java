import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrea on 22/04/2016.
 */
public class FirstClassTest {
    FirstClass firstClass;

    @Before
    public void setUp() throws Exception {
        firstClass = new FirstClass(5,10);
    }

    @Test
    public void testSumVar() throws Exception {
        int sum = firstClass.sumVar();
        assertEquals("Unexpected sum return value",15,sum);
    }

    @Test
    public void testMultiplyVar() throws Exception {
        int mul = firstClass.multiplyVar();
        assertEquals("Unexpected product return value",50,mul);
    }
}