package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class PermutationRecur {
	public static void main(String[] args) {
		int[] input={1,2,1,2};
		System.out.println(permute(input));
	}
	 public static List<List<Integer>> permute(int[] nums) {
		 Arrays.sort(nums);
	        List<List<Integer>> rst=new ArrayList<List<Integer>>();
//	        HashSet<List<Integer>> hset=new HashSet<List<Integer>>();
	        permuteTemp(nums,0,rst);
	        return rst;
	    }
	 public static void permuteTemp(int[] nums,int index, List<List<Integer>> rst){	 
		 if(index==nums.length-1){
		     List<Integer> per=new ArrayList<Integer>();
		     for(int i=0;i<nums.length;i++){
		    	 per.add(nums[i]);
		     }
			 rst.add(per);
			 return;
		 }
		 int depth=index;
		
	        for(int i=depth;i<nums.length;i++){
	        	if(i>depth&&nums[i]==nums[depth]){
	        		continue;
	        	}
	        	swap(nums,depth,i);
	        	permuteTemp(Arrays.copyOf(nums, nums.length),depth+1,rst);
//	        	swap(nums,depth,i);
	        }
	 }
	public static void swap(int[] current, int i, int j){
		int temp=current[j];
		current[j]=current[i];
		current[i]=temp;
	} 
}
