package ap1;
public class ScoresAverage {

	public static void main(String[] args) {
		
	}
	
	public static int scoresAverage(int[] scores) {
		
		int firstHalf =0, secondHalf = 0;
		
		for(int i = 0 ; i < scores.length; i++) {
			if(i< scores.length/2) {
				firstHalf += scores[i];
			}else {
				secondHalf += scores[i];
			}
			
		}
		
		return Math.max(firstHalf/(scores.length/2), secondHalf/(scores.length/2));
	}
}
