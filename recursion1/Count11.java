/*
 * Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.

 count11("11abc11") → 2
 count11("abc11x11x11") → 3
 count11("111") → 1
 */

package recursion1;

public class Count11{
	public static void main(String[] args){
		String str = "abc11x11x11";
		System.out.print(count11(str));
	}
	public static int count11(String str){
		System.out.println(str);
		int length = str.length();
		if(length<= 1 ){
			return 0;
		}
		String pattern = str.substring(0, 2);
		if(pattern.equals("11")){
			return 1+ count11(str.substring(2, length));
		}

		return count11(str.substring(1, length));


	}
}
