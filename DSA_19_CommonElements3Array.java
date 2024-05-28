package DSA_1_LoveBabbar450_Arrays;

import java.util.ArrayList;

class Solution19{
    ArrayList<Integer> commonElements(int []A, int []B, int []C, int n1, int n2, int n3){
        ArrayList<Integer> common= new ArrayList<>();
        int i=0, j=0, k=0;
        int lastA=Integer.MIN_VALUE, lastB=Integer.MIN_VALUE, lastC=Integer.MIN_VALUE;
        while (i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                if(A[i]!=lastA || B[j]!=lastB || C[k]!=lastC){
                    common.add(A[i]);
                    lastA=A[i];
                    lastB=B[j];
                    lastC=C[k];
                }
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        return common;
    }
}
public class DSA_19_CommonElements3Array {
    public static void main(String []args){
        Solution19 s= new Solution19();
        int []A={1, 5, 10, 20, 40, 80};
        int []B={6, 7, 20, 80, 100};
        int []C={3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(s.commonElements(A, B, C, 6, 5, 8));
    }
}
