package leetcodeAlgorithm;

public class CharExist {
	public boolean IfCharExist(String str){
		boolean[] existed=new boolean[256];
		for(int i=0;i<str.length();i++){
			int val=(int)str.charAt(i);
			if(existed[val]==true){
				return false;
			}
				existed[val]=true;
		}
		return true;
	}
	public static void main(String[] args) {
		CharExist result=new CharExist();
		System.out.println(result.IfCharExist("hlelo"));
	}
}
