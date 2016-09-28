package leetcodeAlgorithm;

import java.util.Arrays;

public class PlusOne66 {
	 public static int[] plusOne(int[] digits) {
		 if(digits.length==0){
			 return null;
		 }
		 int end=digits.length-1;
		 if(digits[end]!=9){
			 digits[end]++;
			 return digits;
		 }
		 while(end>=0){
			 if(digits[end]==9){
				 digits[end]=0;
			 }
			 else{
				 digits[end]++;
				 return digits;
			 }
			 end--;
		 }
		 if(end==-1){
			 int[] newArr=new int[digits.length+1];
			 newArr[0]=1;
			 for(int i=1;i<newArr.length;i++){
				 newArr[i]=digits[i-1];
			 }
			 return newArr;
		 }
		 return digits;
	    }
	public static void main(String[] args) {
		int[] test={9,9,9,9,9,9,9};
		System.out.println(Arrays.toString(plusOne(test)));
	}
}
