package leetcodeAlgorithm;

public class MinSizeSubarraySum209 {
	 public static int minSubArrayLen(int s, int[] nums) {
		 int start=0,end=0,sum=0,min=Integer.MAX_VALUE;
		 while(end<nums.length){
			 sum+=nums[end++];
			 while(sum>=s){
				 min=Math.min(min, end-start);
				 sum-=nums[start++];
			 }
		 }
	        return min==Integer.MAX_VALUE?0:min;
	    }
	public static void main(String[] args) {
		int[] nums={1,1,2,3,8,1,2};
		System.out.println(minSubArrayLen(9,nums));

	}

}
