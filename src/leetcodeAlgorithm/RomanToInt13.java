package leetcodeAlgorithm;

public class RomanToInt13 {
	public int covertInt(String Str){
		String roman="IVXLCDM";
		int[] toInt={1,5,10,50,100,500,1000};
		int beforeValue=0;
		int test=0;
		int result=0;
		for(int i=0;i<Str.length();i++){
			int romanIndex=roman.indexOf(Str.charAt(i));
			int afterValue=toInt[romanIndex];
			if(afterValue<=beforeValue){
				test=result;
				result+=afterValue;
			}
			else{
				result=test+(afterValue-beforeValue);
			}
			beforeValue=afterValue;
		}
		return result;
	}
	public static void main(String[] args) {
		RomanToInt13 result=new RomanToInt13();
		System.out.println(result.covertInt("VIV"));
//		String str1="ace";
//		String str2="acb";
//		System.out.println(str1.compareTo(str2));
	}
}
