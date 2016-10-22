package leetcodeAlgorithm;

public class DuplicateMaxGoogle {
	public static int DuplicateMax(int inputN){
		long a=Long.MIN_VALUE;
		System.out.println(a);
		if(inputN==0){
			return 0;
		}
		String inputStr=Integer.toString(inputN);
		for(int i=0;i<inputStr.length()-1;i++){
			if(inputStr.charAt(i)>inputStr.charAt(i+1)){
				inputStr=inputStr.substring(0, i+1)+inputStr.charAt(i)+inputStr.substring(i+1, inputStr.length());
				return Integer.parseInt(inputStr);
			}
		}
		inputStr=inputStr+inputStr.charAt(inputStr.length()-1);
		return Integer.parseInt(inputStr);
	}
	public static void main(String[] args) {
		int test=33342;
		System.out.println(DuplicateMax(test));
	}

}
