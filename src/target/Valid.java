package target;

public class Valid {

    public boolean isValid(String s) {
        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; builder.length() > i; ) {
            if (builder.charAt(i) == ')' && i > 0 && builder.charAt(i - 1) == '(') {
                    builder.delete(i -1 , i + 1);
                    i = i -1;
            } else if (builder.charAt(i) == ']' && i > 0 && builder.charAt(i - 1) == '[') {
                    builder.delete(i -1 , i + 1);
                    i = i -1;
            } else if (builder.charAt(i) == '}' && i > 0 && builder.charAt(i - 1) == '{') {
                    builder.delete(i -1 , i + 1);
                    i = i -1;
            } else {
                i++;
            }
        }
        return builder.length() > 0 ? false : true;
    }
}

