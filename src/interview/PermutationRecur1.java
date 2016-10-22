package interview;

import java.util.ArrayList;
import java.util.List;

public class PermutationRecur1 {
	public static void main(String[] args) {
		int[] input={1,2,3};
		System.out.println(permute(input));
	}
	 public static List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> rst=new ArrayList<List<Integer>>();
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
	        	swap(nums,depth,i);
	        	permuteTemp(nums,depth+1,rst);
	        	swap(nums,depth,i);
	        }
	 }
	public static void swap(int[] current, int i, int j){
		int temp=current[j];
		current[j]=current[i];
		current[i]=temp;
	} 
}
