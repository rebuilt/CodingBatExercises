/*
 * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]

*/
package ap1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List wordsWithoutList(String[] words, int len) {
	      ArrayList out = new ArrayList();
	      
	      for(int i = 0 ; i < words.length ; i++){
	        if(words[i].length() == len){
	          continue;
	        }
	        out.add(words[i]);
	        
	      }
	      return out;
	}
}
