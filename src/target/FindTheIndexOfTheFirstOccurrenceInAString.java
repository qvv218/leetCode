package target;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        int var1 = -1;

        for (int i = 0, j = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                continue;
            }

            boolean b = isStr(haystack.substring(i), needle);

            if (b) {
                return i;
            }

        }
        return var1;
    }

    private boolean isStr(String var1, String var2) {
        if (var1.length() <  var2.length()) {
            return false;
        }

        for (int i = 0, j = 0; i < var1.length() && j < var2.length(); i++, j++) {
            if (var1.charAt(i) != var2.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
