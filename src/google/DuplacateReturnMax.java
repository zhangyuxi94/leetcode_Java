package google;

public class DuplacateReturnMax {
	public static int DuplicateMax(int inputN){
		if(inputN==0){
			return 0;
		}
		String inputStr=Integer.toString(inputN);
		String outputStr="";
		for(int i=0;i<inputStr.length()-1;i++){
			if(inputStr.charAt(i)>inputStr.charAt(i+1)){
				outputStr+=inputStr.charAt(i)+inputStr.substring(i,inputStr.length());
				return Integer.parseInt(outputStr);
			}
			outputStr+=inputStr.charAt(i);
		}
	outputStr=inputStr+inputStr.charAt(inputStr.length()-1);
//	outputStr=outputStr+inputStr.charAt(inputStr.length()-1)+inputStr.charAt(inputStr.length()-1);
		return Integer.parseInt(outputStr);
	}
	
	public static void main(String[] args) {
		int test=4621;
		System.out.println(DuplicateMax(test));
	}
}
