package leetcodeAlgorithm;

public class IsomorphicString205 {
	public static boolean ifIsomorphic(String stra,String strb){
		char[] charArrA=stra.toCharArray();
		char[] charArrB=strb.toCharArray();
		int[] containerA=new int[128];
		int[] containerB=new int[128];
		if(stra.length()==strb.length()){
			for(int i=0;i<charArrA.length;i++){
				if(containerA[(int)charArrA[i]]!=containerB[(int)charArrB[i]]){
					return false;
				}
				containerA[(int)charArrA[i]]=i+1;
				containerB[(int)charArrB[i]]=i+1;
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(ifIsomorphic("paper","title"));
	}
}
