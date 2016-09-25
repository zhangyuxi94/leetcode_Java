package leetcodeAlgorithm;

public class ReverseVowelsOfString345 {
	public static char[] ReverseVowels(String str){
		String vowels="aeiouAEIOU";
		char[] charArr=str.toCharArray();
		int a=0;
		int b=charArr.length-1;
		char t;
		while(a<b){
			while(a<b&&vowels.indexOf(charArr[b])<0){
				b--;
			}
			while(a<b&&vowels.indexOf(charArr[a])<0){
				a++;
			}
			
			t=charArr[a];
			charArr[a]=charArr[b];
			charArr[b]=t;
			b--;
			a++;
		
		}
		return charArr;
	}
	public static void main(String[] args) {
		System.out.println(ReverseVowels("Healluo"));
	}
}
