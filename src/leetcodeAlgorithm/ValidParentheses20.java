package leetcodeAlgorithm;

public class ValidParentheses20 {
	public static boolean isValid(String s){
		char[] stack=new char[s.length()];
		char[] charArr=s.toCharArray();
		int i=0;
		for(int j=0;j<charArr.length;j++){
			switch(charArr[j]){
			case('('):
			case('['):
			case('{'):
				stack[i++]=charArr[j];
				break;
			case('}'):
				if(j==0||stack[--i]!='{'){
					return false;
				}
				break;
			case(']'):
				if(j==0||stack[--i]!='['){
					return false;
				}
				break;
			case(')'):
				if(j==0||stack[--i]!='('){
					return false;
				}
				break;
			default:
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("{[()]]}"));
	}
}
