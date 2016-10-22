package leetcodeAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange228 {
	  public static List<String> summaryRanges(int[] nums) {
		  List<String> rst=new ArrayList<String>();
		  int start=0,end=1;
		  if(nums.length==1){
			  rst.add(""+nums[0]);
			  return rst;
		  }
		  while(end<nums.length){
			  if(nums[end]-nums[end-1]!=1){
				  if(start==end-1){
					  rst.add(""+nums[start]);
				  }
				  else{
					  rst.add(nums[start]+"->"+nums[end-1]);
				  }
				  start=end;
			  }
			  end++;
		  }
		  if(end==nums.length){
			  if(start!=end-1){
				  rst.add(nums[start]+"->"+nums[end-1]);
			  }
			  else{
				  rst.add(""+nums[end-1]);
			  }
		  }
		  return rst;
	    }
	  
	public static void main(String[] args) {
		int[] nums={0,1,2,4,5,7,8,9};
		int[] nums2={3};
		System.out.println(summaryRanges(nums2));
	}
}
