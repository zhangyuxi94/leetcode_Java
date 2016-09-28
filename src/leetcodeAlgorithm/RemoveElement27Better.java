package leetcodeAlgorithm;

public class RemoveElement27Better {
	 public static int removeElement(int[] nums, int val) {
		 int start=0;
		 int end=nums.length-1;
		 while(start<=end){
			 if(nums[start]==val){
				 int temp=nums[start];
				 nums[start]=nums[end];
				 nums[end]=temp;
				 end--;
				 start--;
			 }
			 start++;
		 }
		 return end+1;
	 }

	public static void main(String[] args) {
		int[] test={3,2,2,3};
		System.out.println(removeElement(test,3));
	}

}
