import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleStepTest {
    @Test
    public void testValidInput() {
        assertEquals(4, TripleStep.countNumWays(3));
        assertEquals(2, TripleStep.countNumWays(2));
        assertEquals(0, TripleStep.countNumWays(0));
        assertEquals(13, TripleStep.countNumWays(5));
    }
}
