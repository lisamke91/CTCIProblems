import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsUniqueTest {
    @Test
    public void testValid() {
        assertTrue(IsUnique.isUnique("abc"));
        assertTrue(IsUnique.isUnique("a"));
        assertTrue(IsUnique.isUnique("!1?_ "));
        assertTrue(IsUnique.isUnique("AaBb"));
    }

    @Test
    public void testInvalid() {
        assertFalse(IsUnique.isUnique("aa"));
        assertFalse(IsUnique.isUnique("a!b!"));
    }
}
