package leetcodeAlgorithm;

public class RemoveDupMin {
	public static int RemoveDuplicateMin(int inputN){
		String inputStr=Integer.toString(inputN);
		char key='0';
		int index=0;
		for(int i=0;i<inputStr.length()-1;i++){
			if(inputStr.charAt(i)==inputStr.charAt(i+1)){
				if(inputStr.charAt(i)<key){
					inputStr=inputStr.substring(0, index)+inputStr.substring(index+1,inputStr.length());
					return Integer.parseInt(inputStr);	 
				}
				key=inputStr.charAt(i);
				index=i+1;
			}
		}
		if(key=='0'&&index==0){
			return inputN;
		}
		inputStr=inputStr.substring(0, index)+inputStr.substring(index+1,inputStr.length());
		return Integer.parseInt(inputStr);
	}
	
	public static void main(String[] args) {
		int test=1133554422;
		System.out.println(RemoveDuplicateMin(test));

	}

}
