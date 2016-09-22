package leetcodeAlgorithm;

public class ReverseString344 {
	public static char[] reverseTheString(String str){
		char[] charArr=str.toCharArray();
		char t;
		int i=0;
		int j=charArr.length-1;
	
		while(i<j){
			t=charArr[j];
			charArr[j]=charArr[i];
			charArr[i]=t;
			j--;
			i++;
			System.out.println(charArr);
		}
		return charArr;
	}

	public static void main(String[] args) {
		System.out.println(reverseTheString("hello world"));
	}

}
