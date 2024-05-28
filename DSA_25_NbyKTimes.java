package DSA_1_LoveBabbar450_Arrays;

import java.util.*;

class arrnk{
    public List<Integer> findElements(int []arr, int k){
        List<Integer> result= new ArrayList<>();
        int threshold= arr.length/k;
        HashMap<Integer, Integer> frequencyMap= new HashMap<>();

        for(int num: arr){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);

        }
        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            if(entry.getValue()>threshold){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
public class DSA_25_NbyKTimes {
    public static void main(String [] args){
        arrnk a= new arrnk();
        int []A={3, 1, 2, 2, 1, 2, 3, 3};
        int k=4;
        List<Integer> ans= a.findElements(A, k);
        System.out.println(ans);
    }
}
