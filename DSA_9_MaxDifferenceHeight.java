package DSA_1_LoveBabbar450_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DSA_9_MaxDifferenceHeight {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements in Array: ");
        int a=sc.nextInt();
        int A[]= new int[a];
        for(int i=0; i<A.length; i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Enter the value of K: ");
        int k=sc.nextInt();
        int n=A.length;
        System.out.println(getMinDifference(A, k, n));

    }
    public static void printArray (int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }
    public static int getMinDifference(int A[], int k, int n){
        if(n==1){
            return 0;
        }
        Arrays.sort(A);
        int ans=A[n-1]-A[0];
        for(int i=0; i<A.length; i++){
            if(A[i]<k)
                continue;
            int curr_min=Math.min(A[0]+k, A[i]-k);
            int curr_max=Math.max(A[n-1]-k, A[i-1]+k);
            if(curr_max<curr_min)
                continue;
            ans=Math.min(ans, curr_max-curr_min);
        }
        return ans;

    }
}
