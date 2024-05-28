package DSA_1_LoveBabbar450_Arrays;
import java.util.*;
class FindMedian{
    public int find_median(int []A){
        Arrays.sort(A);
        int n=A.length;
        if(n%2!=0){
            return A[n/2];
        }
        else{
            int mid1=A[(n/2)-1];
            int mid2=A[(n/2)];
            return(mid1+mid2)/2;
        }
    }
}
public class DSA_35_MedianArray {
    public static void main(String [] args){
        FindMedian f= new FindMedian();
        int []A= {90, 100, 78, 89, 67};

        System.out.println(f.find_median(A));
    }
}
