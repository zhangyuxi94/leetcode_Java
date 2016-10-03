package leetcodeAlgorithm;

public class GoogleRemoveLargeRemainSmallest {
	public static int removeLarge(int input){
		String inputStr=Integer.toString(input);
		String sum="";
		for(int i=0;i<inputStr.length()-2;i++){
			if(inputStr.charAt(i)>=inputStr.charAt(i+1)&&inputStr.charAt(i+1)>=inputStr.charAt(i+2)){
				sum=sum+inputStr.charAt(i)+inputStr.substring(i+2, inputStr.length());
				return Integer.parseInt(sum);
			}
			else{
				sum=sum+inputStr.charAt(i);
			}
		}
		if(sum.length()!=inputStr.length()-1){
			char finalChar=(inputStr.charAt(inputStr.length()-2)>inputStr.charAt(inputStr.length()-1))?inputStr.charAt(inputStr.length()-2):inputStr.charAt(inputStr.length()-1);
			sum=sum+finalChar;
	}
		if(sum==""){
			return 0;
		}
		return Integer.parseInt(sum);
	} 
	public static void main(String[] args) {
		System.out.println(removeLarge(355541));
	}

}
