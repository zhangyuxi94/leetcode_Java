package leetcodeAlgorithm;

public class RectangleArea223 {
	  public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	      int leftArea=(C-A)*(D-B);
	      int rightArea=(G-E)*(H-F);
	      int overlap=0;
	      int top=Math.min(D, H);
	      int right=Math.min(C, G);
	      int btm=Math.max(B,F);
	      int left=Math.max(E, A);
	      if(right>left&&top>btm){
	    	  overlap=(right-left)*(top-btm);
	      }
		  return leftArea+rightArea-overlap;
	    }
	public static void main(String[] args) {
		System.out.println(computeArea(-3,0,3,4,0,-1,9,2));
	}

}
