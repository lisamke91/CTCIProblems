/*
 * 1.1 Implement an algorithm to determine if a string has all unique characters.
 *
 * What if you cannot use additional data structures?
 * Brute force O(n^2) or Sort & Search O(n log(n))
 */

import java.util.Hashtable;

public class IsUnique {
    public static boolean isUnique(String s) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        boolean isUnique = true;

        int index = 0;
        while(isUnique && index < s.length()){
            if(hashtable.containsKey(s.charAt(index))) {
                isUnique = false;
            } else {
                hashtable.put(s.charAt(index), 1);
            }
            index++;
        }

        return isUnique;
    }
}
