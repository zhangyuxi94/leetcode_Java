package leetcodeAlgorithm;

public class RemoveDuplicates26 {
	 public static int removeDuplicates(int[] nums) {
		 if(nums.length==0){
			 return 0;
		 }
		 if(nums.length==1){
			 return 1;
		 }
		 int length=1;
		 for(int i=1;i<nums.length;i++){
//			 if(nums[i]==nums[i-1]){
//				 key++;
//			 }
			 if(nums[i]!=nums[i-1]){
				 length++;
				 nums[length-1]=nums[i];
			 }
		 }
		 return length;
	 }
	public static void main(String[] args) {
			int[] test={1,1,1,1,1,2};
			System.out.println(removeDuplicates(test));
		}
}
