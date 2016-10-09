package leetcodeAlgorithm;


public class Search2DMatrix74 {
	 public static boolean searchMatrix(int[][] matrix, int target) {
		 int rowN=matrix.length;
		 for(int i=0;i<rowN;i++){
			 int res=binarySearch(matrix[i],target);
			 if(res!=-1){
				 return true;
			 }
		 }
		 return false;
	 }
	 public static int binarySearch(int[] arr, int num){
		 int low=0;
		 int high=arr.length-1;
		 while(low<=high){
			 int mid=(low+high)/2;
			 if(arr[mid]==num){
				 return mid;
			 }
			 if(arr[mid]<num){
				 low=mid+1;
			 }
			 if(arr[mid]>num){
				 high=mid-1;
			 }
		 }
		 return -1;
	 }
	public static void main(String[] args) {
		int[][] matrix1={{1,3,5,7},{10,11,16,20}};
		System.out.println(searchMatrix(matrix1,11));
	}

}
