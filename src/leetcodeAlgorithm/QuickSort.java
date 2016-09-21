package leetcodeAlgorithm;

import java.util.Arrays;

public class QuickSort {
	public static int[] arraySort(int[] oriArray){
		int key=oriArray[0];
		int t=0;
		int low=0;
		int high=oriArray.length-1;
		int i=low;
		int j=high;
		while(i<j){
			while(oriArray[j]>=key){
				j--;
			}
			if(oriArray[j]<key){
				t=oriArray[i];
				oriArray[i]=oriArray[j];
				oriArray[j]=t;
			}
			System.out.println(Arrays.toString(oriArray)+"1");
			System.out.println("i="+i+"j="+j+"k="+key);
			while(oriArray[i]<=key){
				i++;
			}
			if(oriArray[i]>key){
				t=oriArray[j];
				oriArray[j]=oriArray[i];
				oriArray[i]=t;
			}
			System.out.println(Arrays.toString(oriArray)+"2");
			System.out.println("i="+i+"j="+j+"k="+key);
			j--;	
		}
		System.out.println(Arrays.toString(oriArray)+"3");
		
		return oriArray;
	}
	public static void main(String[] args) {
		int[] test={6,2,7,3,8,9};
		System.out.println(Arrays.toString(arraySort(test)));
	}

}
