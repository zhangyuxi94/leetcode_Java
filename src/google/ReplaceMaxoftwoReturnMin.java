package google;

public class ReplaceMaxoftwoReturnMin {
	public static int solution(int x){
		String inStr=Integer.toString(x);
		if(inStr.length()<=1){
			return x;
		}
		for(int i=0;i<inStr.length()-2;i++){
			if(inStr.charAt(i)>=inStr.charAt(i+1)&&inStr.charAt(i+1)>inStr.charAt(i+2)){
				inStr=inStr.substring(0, i+1)+inStr.substring(i+2,inStr.length());
				return Integer.parseInt(inStr);
			}
		}
		char endChar=(inStr.charAt(inStr.length()-2)>inStr.charAt(inStr.length()-1))?inStr.charAt(inStr.length()-2):inStr.charAt(inStr.length()-1);
		inStr=inStr.substring(0, inStr.length()-2)+endChar;
		return Integer.parseInt(inStr);
	}
	public static void main(String[] args) {
		System.out.println(solution(9888226));
	}
}
