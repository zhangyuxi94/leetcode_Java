package leetcodeAlgorithm;
import java.util.Arrays;

public class bubbleSort {
	public static String sortTheArray(int[] beforeArray){
		String afterArray;
		for(int i=1;i<beforeArray.length;i++){
			for(int j=beforeArray.length-1;j>=i;j--){
				if(beforeArray[j]<beforeArray[j-1]){
					int t=beforeArray[j-1];
					beforeArray[j-1]=beforeArray[j];
					beforeArray[j]=t;
				}
			}
		}
		afterArray=Arrays.toString(beforeArray);
		return afterArray;
		
	}
	public static void main(String[] args) {
		int[] test={1,3,5,243,11,33,24,2};
		System.out.println(sortTheArray(test));
	}
}
