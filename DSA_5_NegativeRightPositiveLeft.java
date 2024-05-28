package DSA_1_LoveBabbar450_Arrays;
import java.util.*;
public class DSA_5_NegativeRightPositiveLeft {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt(); int []A= new int[n];

        System.out.println("Enter the elements into Array");
        for(int i=0; i<A.length; i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Original Array was: ");
        printArray(A);
        // Solution 1:- Partition Process
        int j=0, temp;
        for (int i=0; i<n; i++){
            if(A[i]<0){
                if(i!=j){
                    swap(A, i, j);
                }
                j++;
            }
        }
        printArray(A);

        // Solution 2:- 2 pointers
        /*
        int left=0; int right=n-1;
        while(left<=right){
            if(A[left]<0 && A[right]<0){
                left++;
            }
            else if(A[left]>0 && A[right]<0){
                swap(A, left, right);
                left++;
                right--;
            }
            else if(A[left] >0 && A[right]>0){
                right--;
            }
            else{
                left++;
                right++;
            }
        }
        printArray(A);

         */

    }
    public static void printArray(int []A){
        System.out.print("{");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("}");
    }
    public static void swap(int []A, int i, int j){
        if(i==j){
            return ;
        }
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}
