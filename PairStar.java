/*
 * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/
public class PairStar{
	public static void main(String[] args){
		String str = "hello";
		System.out.println(pairStar(str));

	}
	public static String pairStar(String str){
		
		int length = str.length();
		
		if( str.length()<= 1 ){

			return str;
		}
		if(str.charAt(0) == str.charAt(1)){
			return str.substring(0,1) + "*"+ pairStar(str.substring(1,str.length() ));

			
		}
		return str.substring(0,1) + pairStar(str.substring(1,str.length())); 
	}
}
