package google;

import java.util.Arrays;
import java.util.Stack;

public class AbsolutePathSum {
	public static int solution(String S){
		String[] inputS=S.split("\n");
//		System.out.println(Arrays.toString(inputS));
		Stack<String> stringStack=new Stack<String>();
		stringStack.push(inputS[0]);
		int calc=inputS[0].length();
		int sum=0;
		int lastSpace=0;
		
		for(int i=1;i<inputS.length;i++){
			int space=0;
			for(int j=0;j<inputS[i].length();j++){
				if(inputS[i].charAt(j)==' '){
					space++;
				}
			}
			if(space<=lastSpace){
				for(int n=0;n<=(lastSpace-space);n++){
					calc=calc-stringStack.pop().trim().length();
				}
				stringStack.push(inputS[i]);
				calc+=inputS[i].trim().length();
				lastSpace=space;
				if(inputS[i].contains(".jpeg")||inputS[i].contains(".png")||inputS[i].contains(".gif")){
					sum+=calc;
				}
			}
			if(space>lastSpace){
				stringStack.push(inputS[i]);
				calc+=inputS[i].trim().length();
				lastSpace=space;
				if(inputS[i].contains(".jpeg")||inputS[i].contains(".png")||inputS[i].contains(".gif")){
					sum+=calc;
				}
			}
		}
	
		return sum;
	}
	public static void main(String[] args) {
		String test="/dir1\n /dir11\n /dir12\n  /pic.jpeg\n /file2.gif\n /file3.gif";
		System.out.println(test);
		System.out.println(solution(test));
	}

}
