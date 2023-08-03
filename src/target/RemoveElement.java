package target;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length < 1) {
            return 0;
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] != val) {
                        nums[i] = nums[k];
                        nums[k] = val;
                        j++;
                        break;
                    }
                }
            } else {
                j++;
            }
        }
        return j;
    }
}
