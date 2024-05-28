package DSA_1_LoveBabbar450_Arrays;
class BuySellTwice{
    public int maxProfit(int []prices){
        int n= prices.length;
        if(n<=1){
            return 0;
        }
        int firstbuy=Integer.MIN_VALUE;
        int firstsell=0;
        int secondbuy=Integer.MIN_VALUE;
        int secondsell=0;
        for(int price: prices){
            firstbuy=Math.max(firstbuy, -price);
            firstsell=Math.max(firstsell, firstbuy+price);
            secondbuy= Math.max(secondbuy, firstsell-price);
            secondsell= Math.max(secondsell, secondbuy+price);
        }
        return secondsell;
    }
}
public class DSA_26_BUYSHARE2time {
    public static void main(String [] args){
        BuySellTwice a= new BuySellTwice();
        int []A= {2, 30, 15, 10, 8, 25, 80};
        System.out.println(a.maxProfit(A));
    }

}
