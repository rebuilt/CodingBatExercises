/*
 * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/

package string3;
import array3.Utils;

public class EqualIsNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(count ("This is not", "is"));
		long timeNow = System.currentTimeMillis();
	
		for(long i = 0; i < 10000f; i ++) {
			//System.out.println(count (Utils.getText(), "is"));
			count (Utils.getText(), "is");
			
		}
		System.out.println(System.currentTimeMillis() - timeNow);
		 timeNow = System.currentTimeMillis();
		
		for(long i = 0; i < 10000f; i ++) {
			//System.out.println(count2 (Utils.getText(), "is"));
			count2 (Utils.getText(), "is");
		}
		
		System.out.println(System.currentTimeMillis() - timeNow);
		
	}
	public static boolean equalIsNot(String str) {
		int is = count(str, "is");
		int not = count(str, "not");
		
		return is == not;
	}
	
	public static int count (String str, String query) {
		
	//	char[] chars = str.toCharArray();
		//char[] q = query.toCharArray();
		int count =  0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == query.charAt(0)) {
				for(int j = 1; j < query.length(); j ++) {
					
					if(str.charAt(i+j) != query.charAt(j)  ) {
						break;
					}
					if(j == query.length()-1) {
						count ++;
					}
					
				}
			}
		}
		
		return count;
	}
	public static int count2 (String str, String query) {
		
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(query,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += query.length();
		    }
		}
		
		return count;
	}
}
