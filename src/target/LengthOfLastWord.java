package target;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] var1 = s.split(" ");
        return var1[var1.length - 1].length();
    }
}
