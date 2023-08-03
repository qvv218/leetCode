package target;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int var1 = 0;

        for (; var1 < nums.length; var1++) {
            if (nums[var1] < target) {
                continue;
            }
            return var1;
        }

        return var1;
    }
}
