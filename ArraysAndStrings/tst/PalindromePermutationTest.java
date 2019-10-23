import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromePermutationTest {
    @Test
    public void testValid() {
        assertTrue(PalindromePermutation.isPalindromePermutation("aabbc"));
        assertTrue(PalindromePermutation.isPalindromePermutation("a"));
        assertTrue(PalindromePermutation.isPalindromePermutation("TactCoa"));
    }

    @Test
    public void testInvalid() {
        assertFalse(PalindromePermutation.isPalindromePermutation("abc"));
    }
}
