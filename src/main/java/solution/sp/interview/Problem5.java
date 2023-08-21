package solution.sp.interview;

public class Problem5 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 34, 5, 67, 8, 9};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] > nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int sum = 0;
        int index = 0;
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            s = s + nums[i] + "+";
            if (sum > 100) {
                s += "\b";
                index = i;
                System.out.println(s);
                System.out.println(sum);
                return;
            }
        }

        int diff = sum - 100;

        combine1(s, index, nums, diff);

    }

    private static void combine1(String s, int index, int[] nums, int diff) {
        for (int i = index + 1; i < nums.length; i++) {
            if (diff == nums[i]) {
                s = s + "-" + nums[i];
            }
        }
    }
}
