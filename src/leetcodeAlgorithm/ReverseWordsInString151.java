package leetcodeAlgorithm;

public class ReverseWordsInString151 {
	public static char[] ReverseWords(String str){
		str=str.replaceAll("\\s+", " ");         //or use " +"," "
		char[] strArr=str.toCharArray();
		reverseChar(strArr,0,strArr.length-1);
		System.out.println(strArr);
		
		int i=0;
		int j=0;
		while(i<strArr.length-1){
			if(strArr[i]==' '){
				reverseChar(strArr,j,i-1);
				j=i+1;
			}
			i++;
		}
		if(i==strArr.length-1){
			reverseChar(strArr,j,strArr.length-1);
		}
		return strArr;
	}
	
	
	public static void reverseChar(char[] s,int start,int end){
		while(start<end){
			char temp;
			temp=s[start];
			s[start]=s[end];
			s[end]=temp;
			end--;
			start++;
			}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseWords("abc    def gh"));
	}

}
