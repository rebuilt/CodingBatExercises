/*
 *
 * We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
*/

package ap1;

public class DivideSelf {

	public static void main(String[] args) {
		System.out.println(dividesSelf(128));
	}
	
	public static boolean dividesSelf(int n) {
		String number = "" + n;
		
		if(number.contains("0")) {
			return false;
		}
		int num = n;
		int remainder = 0;
		while(num> 0 ) {
			if((n % (remainder = num%10)) != 0) {
				System.out.println(num);
				System.out.println(remainder);
				return false;
			}
			num = num/10;
		}
		
		return true;
	}
}
