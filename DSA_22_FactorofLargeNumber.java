package DSA_1_LoveBabbar450_Arrays;

import java.util.ArrayList;

class FactorialArrayList{
    ArrayList<Integer> factorial(int N){
        ArrayList<Integer> result= new ArrayList<>();
        result.add(1);
        for(int i=2; i<=N; i++){
            multiply(result, i);
        }
        return result;
    }

    static void multiply(ArrayList<Integer> result, int num){
        int carry=0;
        for(int i=0; i<result.size();i++){
            int product =result.get(i)*num+carry;
            result.set(i,product%10);
            carry=product/10;
        }
        while(carry!=0){
            result.add(carry%10);
            carry/=10;
        }
    }
}
public class DSA_22_FactorofLargeNumber {
    public static void main(String []args){
        FactorialArrayList f = new FactorialArrayList();
        int N = 10;
        ArrayList<Integer> result = f.factorial(N);

        // Print the result in the correct order
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
        System.out.println();

    }
}
