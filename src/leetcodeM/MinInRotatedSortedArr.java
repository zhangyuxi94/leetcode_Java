package leetcodeM;

public class MinInRotatedSortedArr {
	 public static int findMin(int[] nums) {
		 if(nums==null||nums.length==0){
			 return 0;
		 }
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]<nums[i-1]){
	                return nums[i];
	            }
	        }
	        return nums[0];
	    }
	public static void main(String[] args) {
		int[] input1={2,3,0};
		int[] input2={4,5,6,7,0,1,2,3};
		int[] input3={3,4,5,6,7,0,1,2};
		int[] input4={4,5,6,7,0,1,2};
		System.out.println(findMin(input1));

	}

}
