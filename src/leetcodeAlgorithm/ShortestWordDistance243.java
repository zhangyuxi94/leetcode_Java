//
//Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
//
//For example,
//Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
//
//Given word1 = ¡°coding¡±, word2 = ¡°practice¡±, return 3.
//Given word1 = "makes", word2 = "coding", return 1.

package leetcodeAlgorithm;

public class ShortestWordDistance243 {
	public static int shortestDistance(String[] words, String word1, String word2) {
		int indexW1=-1,indexW2=indexW1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<words.length;i++){
			if(word1.equals(words[i])){
				indexW1=i;
				if(indexW2!=-1){
					min=Math.min(indexW1-indexW2, min);
				}
				
			}
			else if(word2.equals(words[i])){
				indexW2=i;
				if(indexW1!=-1){
					min=Math.min(indexW2-indexW1, min);
				}
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		String[] words={"c","f","fds","a","f","c","c"};
		String word1="a";
		String word2="c";
		System.out.println(shortestDistance(words,word1,word2));

	}

}
