package leetcodeAlgorithm;

public class FirstUniqueCharInStr387 {
	public static int findFirstUni(String str){
		if(str.length()==0){
			return -1;
		}
		else if(str.length()==1){
			return 0;
		}
		char[] charArr=str.toCharArray();
		int[] count=new int[128];
		
		for(int i=0;i<charArr.length;i++){
			int asciiVal=(int)charArr[i];
			count[asciiVal]++;
		}
		int result=0;
		for(int j=0;j<count.length;j++){
			if(count[j]==1){
				result=j;
				result=Math.min(result,j);
			}	
		}
		int n=str.indexOf((char)result);
		return n;
	}
	public static void main(String[] args) {
		System.out.println(findFirstUni("cabfabcd"));
	}
}
