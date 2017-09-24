public class ScoreUp{
	public static void main(String[] args){
		String[]  key = {"a", "a", "b", "b"};
		String[] answer = { "a", "a", "b", "c"};

		System.out.println( scoreUp(key, answer));
	}

	public static int scoreUp(String[] key, String[] answers){
		int score  = 0;
		
		for(int i = 0; i < key.length; i++){
			if(answers[i].equals("?")){
				continue;	
			}
			if(answers[i].equals(key[i])){

				score += 4;

		}else{
			score -=1;
		}
		}	

		return score;
	}

}
