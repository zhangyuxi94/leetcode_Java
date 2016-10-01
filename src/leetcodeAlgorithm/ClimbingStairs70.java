package leetcodeAlgorithm;

public class ClimbingStairs70 {
	 public static int climbStairs(int n) {
		 if(n<=2){
			 return n;
		 }
		 int sum=climbStairs(n-1)+climbStairs(n-2);
		 return sum;  
	    }
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
}
