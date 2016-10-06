package leetcodeAlgorithm;

import java.util.*;

public class GroupAnagrams49 {
	  public static List<List<String>> groupAnagrams(String[] strs) {
		  HashMap<String,List<String>> map=new HashMap<String,List<String>>();
		  List<List<String>> result=new ArrayList<List<String>>(5);
		  for(String s:strs){
			  char[] ch=s.toCharArray();
			  Arrays.sort(ch);
			  String newS=new String(ch);
			  if(!map.containsKey(newS)){
				  map.put(newS, new ArrayList<String>());
			  }
			  map.get(newS).add(s);
		  }
		for(List<String> ls:map.values()){
			result.add(ls);
		}	  
		  return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test1={"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(test1));
	}

}
