package interview;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumCombination17 {
	 static String[] phoneMap={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	 public static List<String> letterCombinations(String digits) {
		 List<String> rst=new ArrayList();
		  if (digits.length()==0)
		        return rst;
		 String temp="";
		 combine(digits,temp,rst);
		 return rst;
	    }
	 public static void combine(String digits,String temp,List<String> rst){
		if(digits.length()<1){
			rst.add(temp);
			return;
		}	 
		 String str=phoneMap[digits.charAt(0)-'0'];
			 for(int i=0;i<str.length();i++){
				 combine(digits.substring(1),temp+str.charAt(i),rst);
			 }
	 };
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));

	}

}
