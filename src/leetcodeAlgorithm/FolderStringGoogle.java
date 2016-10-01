package leetcodeAlgorithm;

import java.util.Arrays;
import java.util.Stack;

public class FolderStringGoogle {
	public static int CalStringLen(String inputStr){
		String[] parsedStr=inputStr.split("\n");
		System.out.println(Arrays.toString(parsedStr));
		Stack<String> pathStack=new Stack<String>();
		int sumLength=0;
		pathStack.push(parsedStr[0]);
		int len=parsedStr[0].length();
		for(int i=1;i<parsedStr.length;i++){
			int space=0;
			for(int j=0;j<parsedStr[i].length();j++){
				if(parsedStr[i].charAt(j)==' '){
					space++;
				}
				else{
					break;
				}
			}
			
			if(space==pathStack.size()){
				pathStack.push(parsedStr[i].trim());
				len+=parsedStr[i].trim().length();
			}
		
			else if(space<pathStack.size()){
				int temp=pathStack.size()-space;
				for(int t=0;t<temp;t++){
					String rmv=pathStack.pop();
					len=len-rmv.length();
				}
				pathStack.push(parsedStr[i].trim());
				len+=parsedStr[i].trim().length();
			}
			if(parsedStr[i].contains(".jpeg")||parsedStr[i].contains(".gif")){
//				System.out.println(pathStack);
//				System.out.println(len);
				sumLength+=len;
			}
		}
		return sumLength;
	}
	public static void main(String[] args) {
		String test="/dir\n /dir13\n /dir2\n  /test.jpeg\n  /test.txt\n  dir21\n   pic.gif";
		System.out.println(CalStringLen(test));
	}
}
