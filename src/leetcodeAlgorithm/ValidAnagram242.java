package leetcodeAlgorithm;

import java.util.Arrays;

public class ValidAnagram242 {
	 public static boolean isAnagram(String s, String t) {
		 char[] sArr=s.toCharArray();
		 char[] tArr=t.toCharArray();
		 int[] ascCont=new int[26];
		 if(sArr.length<=tArr.length){
			 for(int i=0;i<sArr.length;i++){
				 ascCont[sArr[i]-'a']++;
			 }
			 for(int i=0;i<tArr.length;i++){	
				 if(ascCont[tArr[i]-'a']==0){
					 return false;
				 }
				 else{
					 ascCont[tArr[i]-'a']--;
				 }
			 }
		 }
		 else{
			 for(int i=0;i<tArr.length;i++){
				 ascCont[tArr[i]-'a']++;
			 }
			 for(int i=0;i<sArr.length;i++){	
				 if(ascCont[sArr[i]-'a']==0){
					 return false;
				 }
				 else{
					 ascCont[tArr[i]-'a']--;
				 }
			 }
		 }
		 for(int i=0;i<ascCont.length;i++){
			 if(ascCont[i]!=0){
				 return false;
			 }
		 }
		 return true;
	 }
	public static void main(String[] args) {
		System.out.println(isAnagram("aa","aa"));
	}

}
