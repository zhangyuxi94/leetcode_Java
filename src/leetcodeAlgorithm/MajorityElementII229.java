package leetcodeAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII229 {
	 public static List<Integer> majorityElement(int[] nums) {
		 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		 List<Integer> arr=new ArrayList<Integer>();
		int count=1;
		 for(int i=0;i<nums.length;i++){
			 if(!map.containsKey(nums[i])){
				 map.put(nums[i], 1);
				 if(nums.length/3<1){
					 arr.add(nums[i]);
				 } 
			 }
			 else{
				 count=map.get(nums[i]);
				 count++;
				 if(count>nums.length/3&&!arr.contains(nums[i])){
					 arr.add(nums[i]);
				 } 
				 map.put(nums[i], count);
			 }	
		 }
		 return arr;
	    }
	public static void main(String[] args) {
//		int[] test2={1};
		int[] test1={2,3,2,3,3,5,2};
		System.out.println(majorityElement(test1));

	}

}
