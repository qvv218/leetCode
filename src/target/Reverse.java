package target;

public class Reverse {

    public int reverse(int x) {
        long var1 = 0;

        for (; x != 0; x = x / 10) {
            var1 = var1 * 10 + x % 10;
        }

        return var1 > 2147483647 || var1 < -2147483648 ?
                0 : (int) var1;
    }
}
