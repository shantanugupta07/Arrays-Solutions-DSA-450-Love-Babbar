package DSA_1_LoveBabbar450_Arrays;
class AlterPosiNegi {
    void rearrange(int[] A) {
        int n = A.length;
        int posIndex = 0, negIndex = 0;

        // Find the first negative element's index
        while (negIndex < n && A[negIndex] >= 0) {
            negIndex++;
        }

        // Rearrange the array by alternating positives and negatives
        while (posIndex < n && negIndex < n) {
            if (posIndex % 2 == 0 && A[posIndex] >= 0) {
                // Even index, expected negative but found positive, so swap
                if (negIndex > posIndex) {
                    int temp = A[posIndex];
                    A[posIndex] = A[negIndex];
                    A[negIndex] = temp;
                    negIndex++;
                }
            } else if (posIndex % 2 == 1 && A[posIndex] < 0) {
                // Odd index, expected positive but found negative, so swap
                while (negIndex < n && A[negIndex] < 0) {
                    negIndex++;
                }
                if (negIndex < n) {
                    int temp = A[posIndex];
                    A[posIndex] = A[negIndex];
                    A[negIndex] = temp;
                    negIndex++;
                }
            }
            posIndex++;
        }
    }
}

public class DSA_20_AltPositiveNegative {
    public static void main(String[] args) {
        int[] A = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        printArray(A);

        AlterPosiNegi Ans = new AlterPosiNegi();
        Ans.rearrange(A);

        printArray(A);
    }

    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
