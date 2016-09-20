package leetcodeAlgorithm;

public class StringToInt {
	public int myAtoi(String str){
		int result=0;
		int neg=1;
		int count=0;
		char[] charArr=str.toCharArray();
		for(int i=0;i<charArr.length;i++){
			count++;
			if(charArr[i]>='0'&&charArr[i]<='9'){
				result*=10;
				result+=(charArr[i]-'0');
			}
			else if(charArr[i]=='-'&&count==1){
				neg=-1;
				count--;
			}
			else if(charArr[i]=='+'&&count==1){
				neg=1;
				count--;
			}
			else if(charArr[i]==' '&&count==1){
				count--;
			}
			else{
				break;
			}
		}
		
		if(result>Integer.MAX_VALUE){
			if(neg==1){
				return Integer.MAX_VALUE;
			}
			else{
				return Integer.MIN_VALUE;
			}
			
		}
		return (neg==1)?result:neg*result;
	}
	public static void main(String[] args) {
		StringToInt test=new StringToInt();
		System.out.println(test.myAtoi(" 2341"));
	}
}

