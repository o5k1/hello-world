import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrea on 25/04/2016.
 */
public class SecondClassTest {

    @Test
    public void testFooA() throws Exception {
        assertEquals("fooA don't explain itself","fooA",SecondClass.fooA());
    }


    @Test
    public void testFooB() throws Exception {
        assertEquals("fooB don't explain itself","fooB",SecondClass.fooB());
    }
}