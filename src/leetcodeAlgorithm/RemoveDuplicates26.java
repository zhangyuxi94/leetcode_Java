package leetcodeAlgorithm;

public class RemoveDuplicates26 {
	public static int removeDuplicates(int[] nums){
		int j=1;
		if(nums.length==0){
			return 0;
		}
		if(nums.length==1){
			return 1;
		}
		for(int i=1;i<nums.length;i++){
			if(nums[i]!=nums[i-1]){
				j++;
			}
		}
		return j;
	}
	public static void main(String[] args) {
		int[] test={1,1,2};
		System.out.println(removeDuplicates(test));
	}

}
