package DSA_1_LoveBabbar450_Arrays;

import java.util.*;
public class DSA_4_ZeroOneTwoWithoutSorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt(); int []A= new int[n];
        System.out.println("Enter the elements into Array");
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
            if(A[i]>2){
                System.out.println("Enter only 0,1,2");
                A[i]=sc.nextInt();
            }
        }
        printArray(A);
        System.out.println("---------------------------");
        int low =0, high=A.length-1, mid=0;
        while(mid<=high){
            if(A[mid]==0){
                swap(A, mid++, low++);
            }
            else if(A[mid]==1){
                mid++;
            }
            else{
                swap(A, mid, high--);
            }

        }
        printArray(A);

    }
    public static void printArray(int A[]){
        System.out.print("{");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("}");
    }
    public static void swap(int A[], int i, int j){
        if(i==j){
            return ;
        }
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}

