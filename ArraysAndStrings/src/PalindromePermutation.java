/*
 * 1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 *
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat". "atco cta". etc.)
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String s) {
        String lowercase = s.toLowerCase();

        // letter counts
        Hashtable<Character, Integer> letterCounts = new Hashtable<>();
        for(int i = 0; i < lowercase.length(); i++) {
            char letter = lowercase.charAt(i);
            if(letterCounts.containsKey(letter)) {
                letterCounts.put(letter, letterCounts.get(letter) + 1);
            } else {
                letterCounts.put(letter, 1);
            }
        }

        // if number of odd letter counts > 1 return false
        Enumeration<Character> keys = letterCounts.keys();
        boolean foundOddElement = false;
        while(keys.hasMoreElements()) {
            if(letterCounts.get(keys.nextElement()) % 2 == 1) {
                if(foundOddElement) {
                    return false;
                } else {
                    foundOddElement = true;
                }
            }
        }
        return true;
    }
}
