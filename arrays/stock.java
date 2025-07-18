package arrays;

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class stock {
    public static void main (String []args){
        int stock[] = {7, 5, 3, 4, 0};
        findMaxProfit(stock);
    }

    public static void findMaxProfit(int stock[]){
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < stock.length; i++){
            if(buy < stock[i]){
                int profit = stock[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buy = stock[i];
            }
        }

        System.out.print("This is max profit in this Stock : " + maxProfit);
    }
}
