package leetcodeAlgorithm;

public class ValidPalindrome125 {
	 public static boolean isPalindrome(String s) {
	        char[] sArr=s.toCharArray();
	        int i=0,count=0;
	        int j=sArr.length-1;
	    
	        while(i<j){
	        	while(sArr[i]<'0'||(sArr[i]>'9'&&sArr[i]<'A')||(sArr[i]>'Z'&&sArr[i]<'a')||sArr[i]>'z'){
	        		i++;
	        		if(i>=sArr.length){
	        			return true;
	        		}	
	        	}
	        	while(sArr[j]<'0'||(sArr[j]>'9'&&sArr[j]<'A')||(sArr[j]>'Z'&&sArr[j]<'a')||sArr[j]>'z'){
	        		j--;
	        	}
	        	
	        	if(sArr[i]!=sArr[j]&&sArr[i]-sArr[j]!=32&&sArr[j]-sArr[i]!=32){
	        		return false;
	        	}
	        	if(sArr[i]>='0'&&sArr[i]<='9'&&(sArr[j]<'0'||sArr[j]>'9')){
	        		return false;
	        	}
	        	if(sArr[j]>='0'&&sArr[j]<='9'&&(sArr[i]<'0'||sArr[i]>'9')){
	        		return false;
	        	}
	        	i++;
	        	j--;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("  , "));

	}

}
