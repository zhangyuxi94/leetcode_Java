package leetcodeAlgorithm;

public class FirstUniqueCharInStr387 {
	public static int findFirstUni(String str){
		if(str.length()==0){
			return -1;
		}
		if(str.length()==1){
			return 0;
		}
		if(str.length()!=0){
			char[] charArr=str.toCharArray();
			int[] count=new int[128];
			int result=str.length()-1;
		
			for(int i=0;i<charArr.length;i++){
				int asciiVal=(int)charArr[i];
				count[asciiVal]++;
				if(count[asciiVal]==charArr.length){
					return -1;
				}
			}
			int test=0;
			for(int j=0;j<count.length;j++){
				if(count[j]==1){
					int number=str.indexOf((char)j);
					result=Math.min(result,number);
					test++;
				}	
			}
			if(test==0){
				return -1;
			}
			return result;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(findFirstUni("cccbb"));
	}
}
