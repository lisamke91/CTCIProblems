import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionTest {
    @Test
    public void testinsert() {
        int N = 512;
        int M = 13;
        int i = 2;
        int j = 5;
        assertEquals(564, Insertion.insert(N, M, i, j));
    }
}
