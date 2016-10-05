package hackerrank;

import java.util.Arrays;

public class LeftRotationArrays {
	public static int[] leftRotation(int n, int d, int[] x){
		int[] temp=new int[d];
		for(int i=0;i<d;i++){
			temp[i]=x[i];
		
		}
		for(int i=0;i<n-d;i++){
			x[i]=x[i+2];
		}
		for(int j=0;j<temp.length;j++){
			x[n-d+j]=temp[j];
		}
		return x;
	}
	public static void main(String[] args) {
		int[] test1={3,4,1,5,6,8};
		System.out.println(Arrays.toString(leftRotation(6,2,test1)));
	}
}
