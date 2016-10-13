package leetcodeAlgorithm;

//A = [4, 3, 2, 6]

//F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
//F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
//F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
//F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

//So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.

public class RotateFun396 {
	 public static int maxRotateFunction(int[] A) {
		 int sum=0,iteration=0;
		 for(int i=0;i<A.length;i++){
			 sum+=A[i];
			 iteration+=A[i]*i;
		 }
		 int max=iteration;
		 for(int j=1;j<A.length;j++){
			 iteration=iteration-sum+(A.length)*A[j-1];
			 max=Math.max(iteration, max);
		 }
	        return max;
	    }
	public static void main(String[] args) {
		int[] test1={4,3,2,6};
		int[] test2={1,2,3,4,5,6,7,8,9,10};
		System.out.println(maxRotateFunction(test2));
	}
}
