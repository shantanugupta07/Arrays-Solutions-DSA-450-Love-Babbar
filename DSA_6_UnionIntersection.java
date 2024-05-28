package DSA_1_LoveBabbar450_Arrays;
import java.util.*;

public class DSA_6_UnionIntersection {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements in Array 1: ");
        int n=sc.nextInt();
        int A[]= new int[n];
        for(int i=0; i<A.length; i++){
            A[i]= sc.nextInt();
        }
        printArray(A);
        System.out.println("Enter the elements in Array 2: ");
        int m=sc.nextInt();
        int B[]= new int[m];
        for(int i=0; i<B.length; i++){
            B[i]= sc.nextInt();
        }
        printArray(B);
        System.out.println("The Union of Array 1 and Array 2 is :"); printUnion(A, B);
        System.out.println("The Intersection of Array 1 and Array 2 is: "); printIntersection(A, B);



    }
    public static void printArray (int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }
    public static void printUnion(int A[], int B[]){
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0; i<A.length; i++){
            hs.add(A[i]);
        }
        for(int i=0; i<B.length; i++){
            hs.add(B[i]);

        }
        System.out.println(hs);
    }
    public static void printIntersection(int A[], int B[]){
        HashSet<Integer>hs = new HashSet<>();
        HashSet<Integer> hs1= new HashSet<>();
        for(int i=0; i<A.length; i++){
            hs.add(A[i]);
        }
        for(int i=0; i<B.length; i++){
            if(hs.contains(B[i])){
                System.out.print(B[i]+" ");
            }
        }
        System.out.println(" ");
    }
}
