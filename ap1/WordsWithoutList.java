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
