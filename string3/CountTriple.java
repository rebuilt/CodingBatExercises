/*
 * We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
*/

package string3;
public class CountTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str =  "aaa";
		System.out.println(countTriple(str));
	}
	
	public static int countTriple(String str) {
		int out = 0;
		char[] word = str.toCharArray();
			for(int i = 0; i< word.length-2; i++	) {
		
				
				for(int j =0 ; j < 3 ; j++) {
					if(j == 2 ) {
					out ++;
					break;
					}
					if(word[i+j] != word[i+j+1]) {
						break;
					}
					
				}
				
			}
		
		return out;
		
	}


}
