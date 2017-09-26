/*
 *
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true

*/

package warmup2;

public class Has271{

	public static void main(String[] args){

int[] nums = { 2, 7, 3};
System.out.println(has271(nums));
	}
	public static boolean has271(int[] nums){
		int firstDelta = 0;
		int secondDelta = 0;

		for(int i = 0; i < nums.length; i ++){
			if(i< nums.length-2){
				firstDelta = nums[i+1] - nums[i];
				secondDelta= nums[i+2] - nums[i];
				if(firstDelta ==5 &&( secondDelta >= -3 && secondDelta <= 1) ){
					return true;
				}
			}
		}
		
		return false;
	}
}
