/*
 * (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/

package array3;

import utils.Utils;

public class Fix45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 4, 1, 5, 5, 4, 1 };

		
		Utils.startTimer();
		int iterations = 1000000000;
		for(int i = 0; i < iterations; i ++) {
		nums = fix45(nums);
		}
		Utils.stopTimer();
		
		Utils.startTimer();
		for(int j = 0; j < iterations; j ++) {
			nums = fix452(nums);
		}
		Utils.stopTimer();
		
		Utils.print(nums);
	}
	public static int[] fix45(int[] nums) 
	{
		boolean[] bools = new boolean[nums.length];
		int[] out = nums.clone();
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) 
		{
			if(nums[i]== 4) {
				bools[i] = true;
				bools[i+1] = true;
				count ++;
				i++;
			}
			else {
				bools[i] = false;
			}
		}
		
	//	Utils.print(bools);
		

		int index = 0;
		for(int k = 0; k< out.length; k ++) {
			if(!bools[k]) {
				for(int m = index; m < nums.length; m++) {
					if(nums[m] != 4 && nums[m] !=5) {
						out[k] = nums[m];
						index = m+1;
						break;
					}
				}
			}
		}
	//	Utils.print(out);
		
		for(int j = 0; j < bools.length; j++) {
			if(bools[j]) {
			out[j] = 4;
			out[j+1] = 5;
			j++;
			
			}
		}
		return out;
	}
	public static int[] fix452(int[] nums) {

	    int[] locations = {-1};

	    for (int i = 0; i < nums.length - 1; ++i) {

	        if (nums[i] == 4) {

	            JLoop:
	            for (int j = nums.length-1; j >= 0; --j) {
	                if (nums[j] == 5) {
	                    for (int k = locations.length-1; k>=0 ; --k) {
	                        if (locations[k] == j) {
	                            //continue JLoop;
	                        	break;
	                        } 
	                    }
	                    nums[j] = nums[i + 1];
	                    nums[i + 1] = 5;
	                    locations[locations.length - 1] = i+1;
	                    locations = java.util.Arrays.copyOf(locations,
	                            locations.length + 1);
	                    locations[locations.length-1] = -1;
	                    break;
	                }
	            }
	        }
	    }
	    return nums;

	}
}
