class Day3_BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        int min= prices[0];
        int maxprofit= 0;
        for(int i =0; i<prices.length; i++)
        {
            if(prices[i]< min)
            {
                min= prices[i];
            }
            else{
                int profit= prices[i]-min;
                if (profit> maxprofit)
                {
                    maxprofit= profit;
                }
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        Day3_BestTimeToBuyStock solution = new Day3_BestTimeToBuyStock();

        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));   // 0
        System.out.println(solution.maxProfit(new int[]{1}));           // 0
        System.out.println(solution.maxProfit(new int[]{2,4,1}));       // 2
    }
}