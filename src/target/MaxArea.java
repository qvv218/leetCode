package target;

public class MaxArea {

    public int maxArea(int[] height) {
        int var1 = height.length - 1;
        int var2 = 0;

        for (int i = 0; i < var1; i++) {
            if (height[i] <= height[var1]) {
                int var4 = height[i] * (var1 - i);

                if (var4 > var2) {
                    var2 = var4;
                }
                continue;
            }

            for (int k = var1; k > i; k--) {
                int var4;

                if (height[k] <= height[i]) {
                    var4 = height[k] * (k - i);

                    if (var4 > var2) {
                        var1 = k;
                        var2 = var4;
                    }
                } else {
                    var4 = height[i] * (k - i);

                    if (var4 > var2) {
                        var1 = k;
                        var2 = var4;
                    }
                    break;
                }
            }
        }
        return var2;
    }
}
