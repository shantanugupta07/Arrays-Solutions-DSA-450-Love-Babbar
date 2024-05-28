package DSA_1_LoveBabbar450_Arrays;
import java.util.*;
class SubsetCheckArray{
    public String isSubset(int[] a1, int[] a2, long n, long m){
        HashMap<Long, Integer> frequencyMap=new HashMap<>();
        for(long num: a1){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }
        for(long num: a2){
            if(!frequencyMap.containsKey(num) || frequencyMap.get(num)==0){
                return "No";
            }
            frequencyMap.put(num, frequencyMap.get(num)-1);
        }
        return "Yes";
    }
}
public class DSA_27_ArraySubsetAnotherArray {
    public static void main(String []args){
        SubsetCheckArray a= new SubsetCheckArray();
        int A[]={11, 7,1,13,21,3,7,3};
        int B[]={11,3,7,1,7};
        System.out.println(a.isSubset(A, B, A.length, B.length));

    }

}
