package DSA_1_LoveBabbar450_Arrays;
import java.util.*;
class TripletSubArray{
    public boolean find3Numbers(int []A, int n, int x){
        Arrays.sort(A);

        for(int i=0; i<n-2; i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int currentSum=A[i]+A[left]+A[right];
                if(currentSum==x){
                    return true;
                }
                else if(currentSum<x){
                    left ++;
                }
                else{
                    right--;
                }
            }
        }
        return false;
    }
}
public class DSA_28_TripletSumArray {
    public static void main(String []args){
        TripletSubArray a= new TripletSubArray();
        int []A= {1, 4, 45, 6, 10, 8};
        int n=A.length;
        int x= 13;
        System.out.println(a.find3Numbers(A,n,x));
    }
}
