package DSA_1_LoveBabbar450_Arrays;

import java.util.Scanner;

public class DSA_10_MinJumpToEnd {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the elements in Array: ");
        System.out.println("Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int A[] = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        printArray(A);
        System.out.println(minJumps(A,n));
    }
    public static void printArray (int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }
    public static int minJumps(int A[], int n){
        if(n<=1)
            return 0;
        if(A[0]==0)
            return -1;
        int maxReach = A[0];
        int step=A[0];
        int jump=1;
        for(int i=1; i<n; i++){
            if(i==n-i){
                return jump;
            }
            maxReach= Math.max(maxReach, A[i]+i);
            step--;
            if(step==0){
                jump++;
                if(i>=maxReach){
                    return -1;
                }
                step=maxReach-i;
            }
        }
        return -1;
    }
}
