/*
 * Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/

package ap1;
public class WordsWithout{
	public static void main(String[] args){
		String[] words = {"a", "b", "c", "a"};
		String remove = "b";
		words = wordsWithout(words, remove);
		printArray(words);

	}

	public static String[] wordsWithout(String[] words, String target){
		
		int count = 0; 

		for(int i = 0; i< words.length; i++){
			if (!target.equals(words[i])){
				count ++;
			}	
		}
		String[] out = new String[count];
		int index = 0;

		for(int j = 0; j < words.length; j++){
			if(!target.equals(words[j])){
			
			out[index] = words[j];
			index++;
		}
		}
		return out;
	}

	public static void printArray(String[] words){
		for(int i =0; i < words.length; i++){
			System.out.print(words[i] +",");
		}
	}

}
