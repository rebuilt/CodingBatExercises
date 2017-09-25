/*
 * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.

copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
*/

package ap1;
public class CopyEndy{
	public static void main(String[] args){
		int[] nums = {9, 11, 90, 22, 6};
		int count = 3;
		nums = copyEndy(nums, count);

		for ( int i = 0; i < nums.length; i++){
			System.out.print(nums[i]+", " );
		}
	}

	public static int[] copyEndy(int[] nums, int count){
		int[] out = new int[count];

		int index = 0;
		
		for(int i = 0; i< nums.length; i++){
			if(isEndy(nums[i])){
				out[index] = nums[i];
				index++;
				if(index==count){
					break;
				}
			}
		}

		return out; 

	}

	public static boolean isEndy(int num){
		
		if( num < 0 || ( num > 10 && num < 90 ) || num > 100){

			return false;
		}


		return true;


	}

}
