package DSA_1_LoveBabbar450_Arrays;

import java.util.*;


class Solution18{
    int getPairsCount(int []arr, int n, int k){
        int count =0;
        Map<Integer, Integer> map= new HashMap<>();
        for(int num: arr){
            int complement=k-num;
            if(map.containsKey(complement)){
                count+=map.get((complement));
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return count;
    }
}
public class DSA_18_CountPairArray {
    public static void main(String[] args){
        Solution18 s= new Solution18();
        int A[]={1,5,7,1};
        System.out.println(s.getPairsCount(A, 4, 6));

    }
}
// Brute Force Approach
/*
it is in c++ language, change it!!
class Solution{
public:
    int getPairsCount(int arr[], int n, int k) {
        // code here
        int ans = 0;
        for(int i = 0; i < n-1; i++) {
            int j;
            for(j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == k ) {
                    ans++;
                }
            }
        }

       return ans;
    }
};
 */
/*
class Solution {
    int getPairsCount(int[] arr, int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;

    }
}
 */