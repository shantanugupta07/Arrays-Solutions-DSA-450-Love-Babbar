package DSA_1_LoveBabbar450_Arrays;
class PalidromicArray{
    public boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;
        while(num!=0){
            int digit=num%10;
            reversed= reversed*10+digit;
            num/=10;
        }
        return original==reversed;
    }
    public int palinArray(int []A, int n){
        for(int i=0; i<n; i++){
            if(!isPalindrome(A[i])){
                return 0;
            }
        }
        return 1;
    }
}
public class DSA_34_PalindromeArray {
    public static void main(String []args){
        PalidromicArray a= new PalidromicArray();
        int []A= {111, 222, 333};
        int n= 3;
        System.out.println(a.palinArray(A, n));
    }
}
