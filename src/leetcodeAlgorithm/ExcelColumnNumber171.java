package leetcodeAlgorithm;

public class ExcelColumnNumber171 {
	
	public static int titleToNumber(String s) {
		char[] cArr=s.toCharArray();
		int res=0;
		for(int i=cArr.length-1;i>=0;i--){
			res=(int)(Math.pow(26, cArr.length-1-i))*(cArr[i]-'A'+1)+res;
		}
        return res;
    }
	
	public static void main(String[] args) {
		System.out.println(titleToNumber("AAA"));
	}

}
