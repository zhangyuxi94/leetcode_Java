package leetcodeAlgorithm;

public class StrStr28 {

	public static int ifSubString(String haystack, String needle){
		int l1=haystack.length();
		int l2=needle.length();
		if(l1<l2){
			return -1;
		}
		else if(l2==0||l1==0){
			return 0;
		}
		int gap=l1-l2;
		for(int i=0;i<=gap;i++){
			if(haystack.substring(i, i+l2).equals(needle)){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String test1="";
		String test2="";
		System.out.println(ifSubString(test1,test2));

	}

}
