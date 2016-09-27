package leetcodeAlgorithm;


public class QuickSortString {
	public static char[] sortStr(String str){
		char[] charArr=str.toCharArray();
		qs(charArr,0,charArr.length-1);
		return charArr;
	}
	private static void qs(char[] items,int left,int right){
		int i=left;
		int j=right;
		char key=items[(left+right)/2];
		do{
			while((items[i]<key)&&(i<right)){
				i++;
			}
			while((items[j]>key)&&(j>left)){
				j--;
			}
			if(i<=j){
				char temp=items[i];
				items[i]=items[j];
				items[j]=temp;
				i++;
				j--;
			}
		}while(i<=j);
		if(left<j){
			qs(items,left,j);
		}
		if(right>i){
			qs(items,i,right);
		}
	};

	public static void main(String[] args) {
		String testStr="cabcdfsz";
		System.out.println(sortStr(testStr));

	}

}
