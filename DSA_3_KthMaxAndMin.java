package DSA_1_LoveBabbar450_Arrays;

import java.util.*;
public class DSA_3_KthMaxAndMin {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n= sc.nextInt(); int []A= new int[n];
        System.out.println("Enter the elements into Array");
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the Kth Number for min");
        int k=sc.nextInt();
        if(k<n){
            kthminandmax(A, k);
        }
        else{
            System.out.println("k value is large");
        }

    }
    // Solution 1 : Through Sorting Arrays
    public static void kthminandmax(int []A, int k){
        Arrays.sort(A);
        System.out.println("Kth Smallest number is "+A[k-1]);
        System.out.println("Kth Largest Number is "+ A[A.length-k]);
    }

    // Solution 2: Binary Search


}
