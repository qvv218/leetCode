package target;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
