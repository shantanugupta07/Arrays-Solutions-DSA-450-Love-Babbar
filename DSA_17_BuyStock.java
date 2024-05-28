package DSA_1_LoveBabbar450_Arrays;
class Solution{
    public int maxProfit(int[] prices){
        int maxProfit=0;
        int minPrice= Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minPrice=Math.min(minPrice, prices[i]);
            maxProfit=Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
}
public class DSA_17_BuyStock {
    public static void main(String [] args){
        System.out.println("Buy Stock Max Profit");
        int[] A ={7, 1, 5, 3, 6, 4};
       // SubArrayGreaterThanX s= new SubArrayGreaterThanX();
        Solution s= new Solution();
        System.out.println(s.maxProfit(A));

    }
}
