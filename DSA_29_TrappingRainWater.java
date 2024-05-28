package DSA_1_LoveBabbar450_Arrays;
class TrappingWater{
    public long trappingWater(int[]A, int n){
        if(n==0){
            return 0;
        }
        int left =0; int right=n-1;
        int left_max=0; int right_max=0;
        long waterTrapped=0;
        while(left<right){
            if(A[left]<A[right]){
                if (A[left]>=left_max){
                    left_max=A[left];

                }
                else{
                    waterTrapped+=left_max-A[left];
                }
                left++;
            }
            else{
                if(A[right]>=right_max){
                    right_max=A[right];
                }
                else{
                    waterTrapped+=right_max-A[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
public class DSA_29_TrappingRainWater {
    public static void main(String [] args){
        int []A={3, 0, 0, 2, 0, 4};
        int n=A.length;
        TrappingWater t = new TrappingWater();
        System.out.println(t.trappingWater(A, n));
    }
}
