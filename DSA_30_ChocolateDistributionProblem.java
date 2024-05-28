package DSA_1_LoveBabbar450_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ChocolateDistribution{
    public long finMinDiff(ArrayList<Integer> a, int n, int m){
        if(m==0 || n==0){
            return 0;
        }
        Collections.sort(a);
        if(n<m){
            return -1;
        }
        long minDiff=Long.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            long diff= a.get(i+m-1)-a.get(i);
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;

    }
}
public class DSA_30_ChocolateDistributionProblem {
    public static void main(String [] args){
        ArrayList<Integer> a= new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        int n= 8;
        int m=5;
        ChocolateDistribution c= new ChocolateDistribution();
        System.out.println(c.finMinDiff(a, n, m));



    }
}
