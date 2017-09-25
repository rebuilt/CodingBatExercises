/*
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
*/

package array3;

public class LinearIn {

	public static void main(String[] args) {
		int[] outer = {
				1, 2, 4, 6
		};
		int[] inner = {2, 3, 4};
		
		System.out.println(linearIn(outer, inner));
	}
	
	public static boolean linearIn(int[] outer, int[] inner) {
		int index = 0;
		boolean[] found = new boolean[inner.length];
		
		 for(int i = 0; i < inner.length; i++) {
			 for(int j = index; j < outer.length; j ++) {
				 if(inner[i] == outer[j]) {
					 found[i] = true;
					 break;
				 }else {
					 found[i] = false;
				 }
				 
				 index = j+1;
				
			 }
			 
		 }
		for(int k = 0; k < found.length; k ++) {
			if(found[k] == false) {
				return false;
			}
		}
		return true;
	}


}
