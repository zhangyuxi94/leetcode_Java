package google;

public class ReplaceMeanoftwoReturnMax {
	public static int solution(int x){
		String inStr=Integer.toString(x);
		String outStr="";
		double a,b;
		int mean;
		if(inStr.length()<=1){
			return x;
		}
		for(int i=0;i<inStr.length()-2;i++){
			if(inStr.charAt(i)<inStr.charAt(i+1)){
				a=Integer.parseInt(""+inStr.charAt(i));
				b=Integer.parseInt(""+inStr.charAt(i+1));
				mean=(int)Math.ceil((a+b)/2);
				outStr=outStr+mean+inStr.substring(i+2,inStr.length());
				return Integer.parseInt(outStr);
			}
			outStr=outStr+inStr.charAt(i);
		}
		if(inStr.charAt(inStr.length()-2)<inStr.charAt(inStr.length()-1)&&(inStr.charAt(inStr.length()-3)-inStr.charAt(inStr.length()-2)<=1)){
			a=Integer.parseInt(""+inStr.charAt(inStr.length()-3));
			b=Integer.parseInt(""+inStr.charAt(inStr.length()-2));
			mean=(int)Math.ceil((a+b)/2);
			outStr=inStr.substring(0, inStr.length()-3)+mean+inStr.charAt(inStr.length()-1);
		}
		else{
			a=Integer.parseInt(""+inStr.charAt(inStr.length()-2));
			b=Integer.parseInt(""+inStr.charAt(inStr.length()-1));
			mean=(int)Math.ceil((a+b)/2);
			outStr=inStr.substring(0, inStr.length()-2)+mean;
		}
		return Integer.parseInt(outStr);
	}
	public static void main(String[] args) {
		System.out.println(solution(54));
	}

}
