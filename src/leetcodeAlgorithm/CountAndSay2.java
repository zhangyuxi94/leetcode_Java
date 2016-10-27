package leetcodeAlgorithm;

public class CountAndSay2 {
	 public static String countAndSay(String str) {
		 StringBuilder sb=new StringBuilder();
		 char curChar=str.charAt(0);
		 int j=1,i=1,count=1;
		 while(j<str.length()){
			 if(str.charAt(j)!=curChar){
				 sb.append("1"+curChar);
				 count=1;
				 curChar=str.charAt(j);
				 j++;
			 } else{
				 i=j;
				 while(str.charAt(i)==curChar){
					 count++;
					 i++;
					 if(i>=str.length()){
						 break;
					 }
				 }
				 sb.append(""+count+curChar);
				 count=1;
				 if(i>=str.length()){
					 return sb.toString();
				 }
				 curChar=str.charAt(i);
				 j=i+1;
			 }
		 }	
		 sb.append("1"+str.charAt(str.length()-1));
		 return sb.toString();
	 }
	 public static void main(String[] args) {
		 System.out.println(countAndSay("1211"));
	 }
}
