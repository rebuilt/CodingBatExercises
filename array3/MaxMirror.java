/*
 * We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
*/

package array3;

public class MaxMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 8, 9, 3, 2, 1 };

		System.out.println(maxMirror(nums));
	}

	public static int maxMirror(int[] nums) {
		int max = 0;
		int count = 0;
		for(int i = 0; i < nums.length; i ++) {
			for(int j = nums.length-1; j >= 0 ; j --) {
			int tmp =i;
			int tmp2 = j;
			while( tmp < nums.length && tmp2 >= 0 && nums[tmp] ==nums[tmp2]) {
				tmp++;
				tmp2--;
				count++;
			}
			if(count> max) {
				max = count;
			}
			count = 0;
			}
			
		}
		
		return max;

	}

}
