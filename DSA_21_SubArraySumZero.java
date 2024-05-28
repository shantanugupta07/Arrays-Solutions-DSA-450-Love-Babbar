package DSA_1_LoveBabbar450_Arrays;

import java.util.*;

class SubArrayZero {
    public static boolean findsum(int[] A, int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}

public class DSA_21_SubArraySumZero {
    public static void main(String[] args) {
        int[] A = {4, 2, -3, 1, 6};
        boolean result = SubArrayZero.findsum(A, A.length);
        System.out.println("Does the array have a subarray with sum zero? \n" + result);
    }
}
