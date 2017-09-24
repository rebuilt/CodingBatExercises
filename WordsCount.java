public class WordsCount{
	public static void main (String[] args ){
	String[] words = "a", "bb", "b", "ccc";
	int length = 1;


		wordsCount(words, len);

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
