package leetcodeAlgorithm;

import java.util.HashMap;

public class MajorityElement169 {
	 public static int majorityElement(int[] nums) {
		 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count=1;
		 for(int i=0;i<nums.length;i++){
			 if(!map.containsKey(nums[i])){
				 map.put(nums[i], 1);
			 }
			 else{
				 count=map.get(nums[i]);
				 count++;
				 if(count>nums.length/2){
					 return nums[i];
				 } 
				 map.put(nums[i], count);
			 }	
		 }
		 return nums[0];
	    }
	public static void main(String[] args) {
		int[] test1={2,2,1,1,1,2,2};
		System.out.println(majorityElement(test1));

	}

}
