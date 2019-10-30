import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {
    @Test
    public void testValidString() {
        assertEquals("a3b1", StringCompression.compressString("aaab"));
        assertEquals("a1b1", StringCompression.compressString("ab"));
        assertEquals("a3b1c2", StringCompression.compressString("aaabcc"));
        assertEquals("a1A1", StringCompression.compressString("aA"));
        assertEquals("a1", StringCompression.compressString("a"));
    }
}
