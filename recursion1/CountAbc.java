/* Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

*/
package recursion1;
public class CountAbc{

	public static void main(String[] args){
		String str = "abaxxaba";
		System.out.println(countAbc(str));

	}

	public static int countAbc(String str){
		if(str.length()<= 2){
			return 0;
		}
		String pattern = str.substring(0,3);

		if(isMatch(pattern)){
			return 1 + countAbc(str.substring(1, str.length()));

		}

			return countAbc(str.substring(1, str.length()));
	}

	public static boolean isMatch( String pattern ){

		return pattern.equals("abc") || pattern.equals("aba");
	}

}
