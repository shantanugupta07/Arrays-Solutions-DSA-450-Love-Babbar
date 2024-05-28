package DSA_1_LoveBabbar450_Arrays;

public class DSA_11_FindDuplicate {
    public static void main(String [] args)
    {
        int nums[]= {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int n = Math.abs(nums[i]) - 1;
            if (nums[n] < 0)
                return n + 1;
            nums[n] = -nums[n];
        }
        return 0; // if no duplicate found
    }
}
