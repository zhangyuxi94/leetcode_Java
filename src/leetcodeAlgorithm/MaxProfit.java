package leetcodeAlgorithm;

public class MaxProfit {
	public static int calMaxPRofit(int[] prices){
		int maxProfit=0;
		int lowestPrice=prices[0];
		if(prices.length<=1||prices==null){
			return 0;
		}
		for(int i=1;i<prices.length;i++){
			maxProfit=Math.max(maxProfit,(prices[i]-lowestPrice));
			lowestPrice=Math.min(lowestPrice,prices[i]);
		}
		return maxProfit;  
	}
	public static void main(String[] args) {
		int[] prices={111,333,222,444};
		System.out.println(calMaxPRofit(prices));
	}

}
