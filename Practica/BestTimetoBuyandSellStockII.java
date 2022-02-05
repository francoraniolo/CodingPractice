package Practica;

import java.util.Arrays;

public class BestTimetoBuyandSellStockII {


        public int maxProfit(int[] prices) {

            int currentBuy=prices[0];

            int currentProfit=0;

            int profit=0;


            for(int i=1;i<prices.length;i++){
                if(prices[i]>currentBuy && currentProfit<(prices[i]-currentBuy)){
                    currentProfit=prices[i]-currentBuy;
                }else{
                    profit=profit+currentProfit;
                    currentProfit=0;
                    currentBuy=prices[i];
                }
            }

            profit=profit+currentProfit;

            return profit;
        }

}
