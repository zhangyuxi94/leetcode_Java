package leetcodeAlgorithm;

public class AddBinary67 {
	 public static String addBinary(String a, String b) {
		 String str="";
		 char[] arr1=a.toCharArray();
		 char[] arr2=b.toCharArray();
		 int i=arr1.length-1;
		 int j=arr2.length-1;
		 int extra=0,sum=0,rst=0,x=0,y=0;
		 while(i>=0||j>=0||extra!=0){
			 x=i<0?0:arr1[i]-'0';
			 y=j<0?0:arr2[j]-'0';
			 sum=x+y+extra;
			 extra=sum/2;
			 rst=sum%2;
			 str=rst+str;
			 i--;
			 j--;
		 }
	        return str;
	    }
	public static void main(String[] args) {
		System.out.println(addBinary("101","11"));
	}
}
