package DSA_1_LoveBabbar450_Arrays;
class MinimumSwapContiguousArray{
    public int minSwap(int []A, int n, int k){
        int count =0;
        for(int i=0; i<n; i++){
            if(A[i]<=k){
                count++;
            }
        }
        int bad=0;
        for(int i=0; i<count; i++){
            if(A[i]>k){
                bad++;
            }
        }
        int ans= bad;
        for(int i=0, j=count; j<n; i++, j++){
            if(A[i]>k){
                bad--;
            }
            if(A[j]>k){
                bad++;
            }
            ans=Math.min(ans, bad);
        }
        return ans;
    }
}
public class DSA_33_MinimumSwaps {
    public static void main(String [] args){
        MinimumSwapContiguousArray a= new MinimumSwapContiguousArray();
        int []A={2, 1, 5, 6, 3};
        int k=3;
        int n=A.length;
        System.out.println(a.minSwap(A, n, k));
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
    }
}
