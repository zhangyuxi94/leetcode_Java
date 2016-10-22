package leetcodeM;

public class MinInRotatedSortedArr153 {
	public static int findMin(int[] nums) {
		int rslt=bst(nums,0,nums.length-1);
		return rslt;
	}
	public static int bst(int[] nums,int start, int end){
		if(start==end){
			return nums[start];
		}
		if(nums[start]<nums[end]){
			return nums[start];
		}
		int mid=(start+end)/2;
		if(nums[start]<nums[mid]||start==mid){
			return bst(nums,mid+1,end);
		}
		return bst(nums,start,mid);
	}
	public static void main(String[] args) {
		int[] input1={0,1,2,3,4,5,6,7};
		int[] input2={4,5,6,7,0,1,2,3};
		int[] input3={3,4,5,6,7,0,1,2};
		int[] input4={4,5,6,7,0,1,2};
		System.out.println(findMin(input4));

	}

}
