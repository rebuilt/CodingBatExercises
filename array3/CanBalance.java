/*
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

package array3;
public class CanBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 5, -2, 3, 8};
		
		System.out.println(canBalance(nums));
	}
	public  static boolean canBalance(int[] nums) {
		  int rightTotal = 0;
		  
		  for(int i = 0; i < nums.length; i ++) {
			 rightTotal += nums[i];
			  
		  }
		  
		  int leftTotal = 0;
		  for(int j = 0; j< nums.length; j ++) {
			  leftTotal += nums[j];
			  rightTotal -= nums[j];
			  if(leftTotal == rightTotal) {
				  System.out.println(j);
				  return true;
				  
			  }
		  }
		  
		  
		  return false;
		}
}
