package DSA_1_LoveBabbar450_Arrays;
class SubarrayMaxProduct{
    long maxProduct(int []A, int n){
        if(n==0){
            return 0;
        }
        long maxProduct=A[0];
        long minProduct=A[0];
        long maxResult= A[0];
        for(int i=1; i<n; i++){
            if(A[i]<0){
                long temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct =Math.max((long) A[i], maxProduct*A[i]);
            minProduct=Math.min((long)A[i], minProduct*A[i]);
            maxResult= Math.max(maxResult, maxProduct);
        }
        return maxResult;
    }
}
public class DSA_23_SubArrayProductMax {
    public static void main(String []args){
        SubarrayMaxProduct a= new SubarrayMaxProduct();
        int []A={6, -3, -10, 0, 2};
        System.out.println(a.maxProduct(A, 5));
    }
}
