package leetcodeAlgorithm;

public class ClimbingStairsRcur70 {
	 public static int climbStairs(int n) {
		 if(n<=0){
			 return 0;
		 }
		 if(n==1){
			 return 1;
		 }
		 int[] sum=new int[n+1];
		 sum[0]=0;
		 sum[1]=1;
		 sum[2]=2;
		
		 for(int i=3;i<n+1;i++){
			 sum[i]=sum[i-1]+sum[i-2];
		 }
		 return sum[n];  
	    }
	public static void main(String[] args) {
		System.out.println(climbStairs(6));
	}
}
