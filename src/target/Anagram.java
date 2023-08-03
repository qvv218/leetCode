package target;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] var1 = s.toCharArray();
        char[] var2 = t.toCharArray();

        Arrays.sort(var1);
        Arrays.sort(var2);

        return Arrays.equals(var1, var2);
    }
}
