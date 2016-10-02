package leetcodeAlgorithm;

import java.util.Arrays;

public class MergeSortedArray88 {
	 public static void merge(int[] nums1,int m,int[] nums2,int n){
	        int startIndex=m+n-1,i=m-1,j=n-1;
	        while(i>=0&&j>=0){
	            nums1[startIndex--]=(nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
	        }
	        while(j>=0){
	             nums1[startIndex--]=nums2[j--];
	        }
	      }
	public static void main(String[] args) {
		int[] nums1={1,3,6,0,0,0};
		int[] nums2={2,4,0};
		merge(nums1,3,nums2,2);
		System.out.println(Arrays.toString(nums1));
	}

}
