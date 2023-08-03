package target;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        String var1 = s.charAt(0) + "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    continue;
                }

                String var2 = s.substring(i + 1, j);

                boolean b = getPalindrome(var2);

                if (b) {
                    var1 = var1.length() < var2.length() + 2 ? s.charAt(i) + var2 + s.charAt(j) : var1;
                }

                if (var1.length() >= j - i + 1) {
                    break;
                }
            }
        }

        return var1;
    }

    public boolean getPalindrome(String s) {

        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
