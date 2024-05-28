package DSA_1_LoveBabbar450_Arrays;
import java.util.*;
public class DSA_2_MaxAndMin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array & Enter the elements into Array");
        int n= sc.nextInt(); int []A= new int[n];
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        printArray(A);
        int max=0; int min=A[0];
        for(int i=0; i<A.length; i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<A[0]){
                min=A[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void printArray(int []A){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }
}