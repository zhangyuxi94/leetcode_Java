package google;

import java.util.Stack;

public class MaxAbsolutePath {
	public static int solution(String S){
		String[] inputS=S.split("\n");
		Stack<String> stringStack=new Stack<String>();
		stringStack.push(inputS[0]);
		int calc=inputS[0].length();
		int lastSpace=0;
		int max=0;
		int result=0;
		
		for(int i=1;i<inputS.length;i++){
			
			int space=0;
			for(int j=0;j<inputS[i].length();j++){
				if(inputS[i].charAt(j)==' '){
					space++;
				}
				if(inputS[i].charAt(j)!=' '){
					inputS[i]="/"+inputS[i];
					break;
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
					result=calc-inputS[i].trim().length();
					max=Math.max(result, max);
				}
			}
			if(space>lastSpace){
				stringStack.push(inputS[i]);
				calc+=inputS[i].trim().length();
				lastSpace=space;
				if(inputS[i].contains(".jpeg")||inputS[i].contains(".png")||inputS[i].contains(".gif")){
					result=calc-inputS[i].trim().length();
					max=Math.max(result, max);
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		String test="/dir1\n /dir11\n /dir12\n  /pic.jpeg\n /file2.gif\n /file3.gif";
		String test2="/dir1\n /dir11\n /dir12\n  /picture.jpeg\n  /dir121\n  /file1.txt\n/dir2\n /dir11\n /dir1232\n  /file2.gif";
		String test3="dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		System.out.println(test3);
		System.out.println(solution(test3));
	}

}
