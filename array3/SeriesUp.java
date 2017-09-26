/*
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
*/

package array3;

import utils.Utils;

public class SeriesUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Utils.print(seriesUp(3));
	}
	public static int[] seriesUp(int n) {
		int[] out = new int [ n*(n+1)/2];
	 	int count = 0;
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < i+1; j++) {
			out[count] = j+1;
			count ++;
			}
		}
		
		return out;
		  
	}

}
