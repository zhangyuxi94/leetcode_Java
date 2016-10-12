package interview;
//È«ÅÅÁĞ backtracking

public class PermutationRecur {
	public static void main(String[] args) {
		String input="123";
		char[] s=input.toCharArray();
		permutate(s, 0);
	}
	public static void permutate(char[] s, int i){
		if(i==s.length-1){
//			if(s[2]=='3'){
//				return;
//			}
//			for(int j=1;j<s.length;j++){
//				if((s[j-1]=='1'&&s[j]=='2')||(s[j-1]=='2'&&s[j]=='1')){
//					return;
//				}
//			}
			System.out.println(new String(s));
			return;
		}
		
		int current=i;
		while(i<s.length){
			swap(s,i,current);
			permutate(s,current+1);
			swap(s,i,current);
			i++;
		}
	}
	public static void swap(char[] s, int i, int j){
		char temp=s[j];
		s[j]=s[i];
		s[i]=temp;
	} 
}
