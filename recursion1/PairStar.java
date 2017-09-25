/*
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a " ".

pairStar("hello") → "hel lo"
pairStar("xxyy") → "x xy y"
pairStar("aaaa") → "a a a a"
*/
package recursion1;
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
			return str.substring(0,1) + " "+ pairStar(str.substring(1,str.length() ));

			
		}
		return str.substring(0,1) + pairStar(str.substring(1,str.length())); 
	}
}
