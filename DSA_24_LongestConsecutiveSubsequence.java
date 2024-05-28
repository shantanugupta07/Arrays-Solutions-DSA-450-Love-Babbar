package DSA_1_LoveBabbar450_Arrays;

import java.util.HashSet;

class LCSSol{
    public int findLongestConseqSubseq(int []arr, int N){
        HashSet<Integer> set = new HashSet<>();
        int maxLen=0;
        for(int num: arr){
            set.add(num);
        }
        for(int num: arr){
            if(!set.contains(num-1)){
                int currNum=num;
                int currLen=0;

                while (set.contains(currNum)){
                    currNum++;
                    currLen++;
                }
                maxLen=Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }

}
public class DSA_24_LongestConsecutiveSubsequence {
    public static void main(String [] args){
        LCSSol s= new LCSSol();
        int []A= {2,6,1,9,4,5,3};
        int ans= s.findLongestConseqSubseq(A, A.length);
        System.out.println(ans);
    }
}
