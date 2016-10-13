package leetcodeAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOf2Arrs349 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		List<Integer> lt=new ArrayList<Integer>();
		for(int i=0;i<nums1.length;i++){
			if(!map.containsKey(nums1[i])){
				map.put(nums1[i], 1);
			}
		}
		for(int j=0;j<nums2.length;j++){
			if(map.containsKey(nums2[j])){
				lt.add(nums2[j]);
				map.remove(nums2[j]);
			}
		};
		
		  int[] arr = new int[lt.size()];
	        for (int i= 0; i < lt.size(); i++) arr[i] = lt.get(i);
		return arr;
	}
	public static void main(String[] args) {
		int[] nums1={1,2,2,1,3};
		int[] nums2={2,3};
		System.out.println(Arrays.toString(intersection(nums1,nums2)));
	}

}
