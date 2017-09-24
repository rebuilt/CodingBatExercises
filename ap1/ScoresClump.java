package ap1;

public class ScoresClump {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 5, 6 };
		System.out.println(scoresClump(numbers));
	}

	public static boolean scoresClump(int[] scores) {
		int[] ints = new int[scores.length];

		for (int i = 0; i < scores.length - 1; i++) {
			
			ints[i] = scores[i + 1] - scores[i]; 
	
			if( i-1 >= 0 ) {
				if(ints[i] + ints[i-1] <= 2) {
					return true;
				}
			}

		}
		return false;
	}

}
