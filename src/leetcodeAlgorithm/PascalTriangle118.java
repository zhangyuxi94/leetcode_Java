package leetcodeAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
	 public static List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> rst=new ArrayList<List<Integer>>();
//		 if(numRows==0){
//			 return rst;
//		 }
		 for(int i=0;i<numRows;i++){
			 rst.add(new ArrayList<Integer>());
		 }
		 rst.get(0).add(1);
		 if(numRows==1){
			 return rst;
		 }
		 
		 rst.get(1).add(1);
		 rst.get(1).add(1);
		 if(numRows==2){
			 return rst;
		 }
		 for(int i=2;i<numRows;i++){
			 rst.get(i).add(1);
			 for(int j=0;j<i-1;j++){
				 rst.get(i).add(rst.get(i-1).get(j)+rst.get(i-1).get(j+1));
			 }
			 rst.get(i).add(1);
		 }
		 return rst;
	 }
	public static void main(String[] args) {
		System.out.println(generate(6));
	}
}
