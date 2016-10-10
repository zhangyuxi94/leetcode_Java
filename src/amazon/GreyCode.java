package amazon;

import java.util.*;

public class GreyCode {
	public static List<Integer> getGreyCode(int n){
		List<Integer> rst=new ArrayList<Integer>();
	
		rst.add(0);
		for(int i=0;i<n;i++){
			int size=rst.size();
			for(int j=rst.size()-1;j>=0;j--){
				rst.add(rst.get(j)+size);
			}
		}
		return rst;
	}
	public static void main(String[] args) {
		System.out.println(getGreyCode(3));
	}

}
