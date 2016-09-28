package leetcodeAlgorithm;

public class LengthOfLastWord58 {
	 public static int lengthOfLastWord(String s) {
		 char[] str=s.trim().toCharArray();
		 int j=str.length-1;
		 int length=0;
		 for(int i=str.length-1;i>=0;i--){
				 j--;
				 if(str[i]==' '){
					 length=str.length-j-2; 
					 return length;
				 }
				 if(i==0){
					 return str.length;
				 }
		 }
	        return length;
	    }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(""));
	}

}
