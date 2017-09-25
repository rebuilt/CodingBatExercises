/*
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
*/

package recursion1;

public class Count7 {

	public static void main(String[] args) {

		int num = 73123471;
System.out.println(count7(num));
	}
	public static int count7(int n) {
		  if(n <= 0){
		    return 0;
		    
		  }
		  int out = 0;
		  
		  if(n%10 == 7 ) {
			  out = 1;
		  }
		  
		  return out + count7(n/10); 
		}

}
