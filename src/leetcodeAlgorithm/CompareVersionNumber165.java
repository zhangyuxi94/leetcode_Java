package leetcodeAlgorithm;

public class CompareVersionNumber165 {
	 public static int compareVersion(String version1, String version2) {	 
		 String[] charArrv1=version1.split("\\.");
		 String[] charArrv2=version2.split("\\.");
		 int count1=0,count2=0;
		 for(int i=charArrv1.length-1;i>=0;i--){
			 if(Integer.parseInt(charArrv1[i])!=0){
				 break;
			 }
			 count1++; 
		 }
		 for(int i=charArrv2.length-1;i>=0;i--){
			 if(Integer.parseInt(charArrv2[i])!=0){
				 break;
			 }
			 count2++; 
		 }
		 int[] intarrv1=new int[charArrv1.length-count1];
		 int[] intarrv2=new int[charArrv2.length-count2];
		 for(int i=0;i<intarrv1.length;i++){
			 intarrv1[i]=Integer.parseInt(charArrv1[i]);
		 }
		 for(int i=0;i<intarrv2.length;i++){
			 intarrv2[i]=Integer.parseInt(charArrv2[i]);
		 }
		 int i=0,j=0;
		 while(i<intarrv1.length&&j<intarrv2.length){
			 if(intarrv1[i]==intarrv2[i]){
				 i++;
				 j++;
			 }
			 else{
				 return (intarrv1[i]<intarrv2[i])?-1:1;
			 }
		 }
		 if(i==intarrv1.length&&j==intarrv2.length){
			 return 0;
		 }
		 if(i==intarrv1.length){
			 return -1;
		 }
		 if(j==intarrv2.length){
			 return 1;
		 }
		 return 0;
	 }
	public static void main(String[] args) {
		System.out.println(compareVersion("1.2.8","1.1"));
	}
}
