/*
 * Given an array of strings, return the count of the number of strings with the given length.

wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0
*/

package ap1;
public class WordsCount{
	public static void main (String[] args ){
	String[] words = {"a", "bb", "b", "ccc"};
	int length = 1;


		wordsCount(words, length);

	}

	public static int wordsCount(String[] words, int len){
		int count = 0;
		for(int i = 0; i< words.length; i ++){
			if(words[i].length() == len){
				count ++;
			}
		}
		return count;
	}
}
