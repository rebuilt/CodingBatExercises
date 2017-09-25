/*
 * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
*/

package array3;

public class Fix34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 1, 3, 4, 4 };
int iterations = 10000000;

Utils.startTimer();
for(int i = 0 ; i < iterations; i ++) {
		nums = fix34(nums);
}
Utils.stopTimer();

Utils.startTimer();

for(int i = 0; i < iterations; i ++) {
	nums = fix342(nums);
}

Utils.stopTimer();

		Utils.print(nums);
	}

	public static int[] fix34(int[] nums) {
		int[] copy = nums.clone();
		int lastIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				for (int j = lastIndex; j < copy.length; j++) {
					if (copy[j] == 4) {
						nums[j] = nums[i + 1];
						nums[i + 1] = copy[j];

						lastIndex = j + 1;
						break;
					}
				}
			}
		}

		return nums;
	}

	public static int[] fix342(int[] nums) {
		int t = 0;
		for (int i = 0; i < nums.length; i++)
			for (int j = 0; j < nums.length; j++)

				if (nums[i] == 4 && nums[j] == 3) {
					t = nums[j + 1];
					nums[j + 1] = nums[i];
					nums[i] = t;
				}
		return nums;
	}

}
