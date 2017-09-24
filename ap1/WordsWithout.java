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
