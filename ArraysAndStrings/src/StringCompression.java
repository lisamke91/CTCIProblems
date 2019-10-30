public class StringCompression {
    /*
     * 1.6 Implement a method to perform basic string compression using the counts of repeated
     * characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed"
     * string would not become smaller than the original string, your method should return the
     * original string. You can assume the string has only uppercase and lowercase letters (a - z).
     */

    public static String compressString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();

        int charCount = 1;
        stringBuilder.append(inputString.charAt(0));
        if(inputString.length() > 1) {
            for(int i = 1; i < inputString.length(); i++) {
                if(inputString.charAt(i) == stringBuilder.charAt(stringBuilder.length() - 1)) {
                    charCount++;
                } else {
                    stringBuilder.append((char) (charCount + '0'));
                    stringBuilder.append(inputString.charAt(i));
                    charCount = 1;
                }
            }
        }
        stringBuilder.append((char) (charCount + '0'));
        return stringBuilder.toString();
    }

}
