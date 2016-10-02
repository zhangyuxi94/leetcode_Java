package leetcodeAlgorithm;

public class MergeSortedArray {
	 public static int[] merge(int[] nums1, int[] nums2) {
		 String str1=nums1.toString();
		 System.out.println(str1);
//		 String str1=Integer.toString(nums1);
	        return nums1;
	    }
	public static void main(String[] args) {
		int[] num1={1,4,5,7,11};
		int[] num2={2,8,10,12};
		System.out.println(merge(num1,num2));

	}

}
