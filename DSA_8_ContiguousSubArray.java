package DSA_1_LoveBabbar450_Arrays;

public class DSA_8_ContiguousSubArray {
    public static void main(String [] args){
        int A[]={1, 2, 3, -2, 5};
        int n=5;
       System.out.println(maxSubArray(A, n));
    }


    public static int maxSubArray(int A[], int n){
        int dp[]= new int[n];
        dp[0]= Math.max(0, A[0]);
        int omax=dp[0];
        for(int i= 1; i<n; i++){
            dp[i]= Math.max(dp[i-1]+A[i], A[i]);
            omax= Math.max(dp[i], omax);
        }
        return omax;
    }
}
