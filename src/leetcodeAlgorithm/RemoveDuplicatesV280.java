package leetcodeAlgorithm;

public class RemoveDuplicatesV280 {
	 public static int removeDuplicates(int[] nums) {
		 int length=1,count=0;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]!=nums[i-1]){
	                nums[length++]=nums[i];
	                count=0;
	            }
	            else if(count==0){
	                nums[length++]=nums[i];
	                count++;
	            }
	        }
	        return length;
	 }
	public static void main(String[] args) {
			int[] test={1,1,1,1,1,2};
			System.out.println(removeDuplicates(test));
		}
}
