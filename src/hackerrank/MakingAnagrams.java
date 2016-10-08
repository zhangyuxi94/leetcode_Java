package hackerrank;

import java.util.Arrays;

public class MakingAnagrams {
	 public static int numberNeeded(String first, String second) {
		 char[] chArr1=first.toCharArray();
		 char[] chArr2=second.toCharArray();
		 Arrays.sort(chArr1);
		 Arrays.sort(chArr2);

		 int i=0,j=0,dele=0;
		 while((i<chArr1.length)&&(j<chArr2.length)){
			 if(chArr1[i]>chArr2[j]){
				 j++;
				 dele++;
			 }
			 else if(chArr1[i]==chArr2[j]){
				 i++;
				 j++;
			 }
			 else if(chArr1[i]<chArr2[j]){
				 i++;
				 dele++;
			 }
		 }
		 if(i==chArr1.length){
			 dele+=chArr2.length-j;
		 }
		 if(j==chArr2.length){
			 dele+=chArr1.length-i;
		 }
		 return dele;
	 }
	public static void main(String[] args) {
		String first="cde";
		String second="abc";
		System.out.println(numberNeeded(first, second));
	}
}
