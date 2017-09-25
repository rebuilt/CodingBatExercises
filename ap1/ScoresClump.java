/*
 * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
*/

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
