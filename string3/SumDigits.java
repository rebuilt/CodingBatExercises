package string3;
public class SumDigits {

	public static void main(String[] args) {
			String word = "Chocolate";
			System.out.println(sumDigits(word));
	}
	public static int sumDigits(String str) {
		  int count = 0;
		  char[] word = str.toCharArray();
		  for(int i = 0; i < word.length; i ++) {
			  
			  if(Character.isDigit(word[i])) {
				  count += Character.getNumericValue(word[i]);
			  }
			  
		  }
		  
		  
		  return count;
	}

}
