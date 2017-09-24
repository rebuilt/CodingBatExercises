public class MaxBlock{
	public static void main(String[] args){

		String str = "abbCCCddBBBxx";
		System.out.println(maxBlock(str));

	}
	public static int maxBlock(String str) {
		int max   = 0;

		if(str.length() == 0){
			return max;
		}


		char[] word = str.toCharArray();
		char lastChar = word[0];
		max = 1;
		int count = 0;
		for (int i = 1 ; i < word.length ; i++){

			if(lastChar == word[i]){
				count++;
			}else{
				if(count> max )
				  { max = count; }
				
				count = 1;
				lastChar = word[i];
			}

		
		return max ;
	}
	}


}
