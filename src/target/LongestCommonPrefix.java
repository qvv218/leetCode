package target;

public class LongestCommonPrefix {

    public String solution(String[] strs) {
        if (strs.length < 1) {
            return "";
        }

        StringBuilder builder = new StringBuilder(strs[0]);

        for (int i = 0; builder.length() > i; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    builder.delete(i, builder.length()).toString();
                    break;
                } else if (strs[j].charAt(i) != builder.charAt(i)) {
                    return builder.delete(i, builder.length()).toString();
                }
            }
        }
        return builder.toString();
    }
}