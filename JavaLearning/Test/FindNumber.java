package JavaLearning.Test;

public class FindNumber {
    public static int main(String[] args) {

        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int i, index = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target && nums[i + 1] > target) {
                index = i + 1;

            }

        }
        return index;

    }

}
