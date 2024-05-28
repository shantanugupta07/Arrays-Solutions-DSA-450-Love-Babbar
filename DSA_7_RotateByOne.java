package DSA_1_LoveBabbar450_Arrays;
import java.util.*;
public class DSA_7_RotateByOne {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size and Enter the elements in Array 1: ");
        int n=sc.nextInt();
        int A[]= new int[n];
        for(int i=0; i<A.length; i++){
            A[i]= sc.nextInt();
        }
        printArray(A);
        int temp=A[n-1];
        for(int i=n-1; i>0; i--){
            A[i]=A[i-1];
        }
        A[0]=temp;
        printArray(A);
    }
    public static void printArray (int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }
}
