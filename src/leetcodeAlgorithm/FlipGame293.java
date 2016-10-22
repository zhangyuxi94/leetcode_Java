package leetcodeAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class FlipGame293 {
	public static List<String> generatePossibleNextMoves(String s) {
		List<String> result=new ArrayList<String>();
		char[] arr=s.toCharArray();
		int start=0, end=arr.length-1;
		
	    return next(arr,start,end,result);
	}
	public static List<String> next(char[] arr, int start, int end, List<String> result){
		for(int i=start+1;i<=end;i++){
			if(arr[i]=='+'&&arr[i-1]=='+'){
				arr[i-1]='-';
				arr[i]='-';
				result.add(new String(arr));
				start=i;
				arr[i-1]='+';
				arr[i]='+';
				next(arr,start,end,result);
				return result;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(generatePossibleNextMoves("+++-+---++-"));
	}

}
