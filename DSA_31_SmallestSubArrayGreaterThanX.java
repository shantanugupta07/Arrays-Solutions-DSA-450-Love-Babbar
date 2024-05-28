package DSA_1_LoveBabbar450_Arrays;
class SubArrayGreaterThanX {
    public int smallestSubWithSum(int []A, int n, int x){
        int start = 0;
        int end = 0;
        int current_sum = 0;
        int min_length = n + 1;
        while (end < n) {
            while (current_sum <= x && end < n) {
                current_sum += A[end++];
            }
            while (current_sum > x && start < n) {
                if (end - start < min_length) {
                    min_length = end - start;
                }
                current_sum -= A[start++];
            }
        }
        return (min_length == n + 1) ? 0 : min_length;
    }
}

public class DSA_31_SmallestSubArrayGreaterThanX {
    public static void main(String [] args){
        SubArrayGreaterThanX a = new SubArrayGreaterThanX();
        int []A = {1, 4, 45, 6, 0, 19};
        int x = 51;
        int n = A.length;
        System.out.println(a.smallestSubWithSum(A, n, x));
    }
}
