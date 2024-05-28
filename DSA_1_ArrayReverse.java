package DSA_1_LoveBabbar450_Arrays;
import java.util.*;
public class DSA_1_ArrayReverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size and elements into Array");
        int n=sc.nextInt(); int A[]= new int[n];
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        printArray(A);
        int i=0; int j=A.length-1;
        while(i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++; j--;
        }
        printArray(A);
    }
    public static void printArray(int []A){
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }
}