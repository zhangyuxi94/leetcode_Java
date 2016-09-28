package leetcodeAlgorithm;

public class RemoveElement27 {
	 public static int removeElement(int[] nums, int val) {
		 if(nums.length==0){
			 return 0;
		 }
		int key=0;
		 for(int i=0;i<nums.length;i++){
			 if(nums[i]!=val){
				 nums[key]=nums[i];
				 key++;
			 }
		 }
		 return key;
	    }

	public static void main(String[] args) {
		int[] test={3,3,3,1};
		System.out.println(removeElement(test,3));
		String testtest="  Hello World ";
		System.out.println(testtest.trim());
	}
}