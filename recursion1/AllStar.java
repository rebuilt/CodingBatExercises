/*
 * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/

package recursion1;
public class AllStar{
	public static void main(String[] args){

	System.out.println(	allStar("akljsdfa"));
	}
	public static String allStar(String str){
		System.out.println(str);

		if(str.lastIndexOf("*") > str.length()-3){
			return str;
		}
		int index = str.lastIndexOf("*" );

		if(index == -1){
			return allStar(str.substring(0,1) + "*"+ str.substring(1,str.length()));
		}
		return allStar(str.substring(0,index+2 )+"*"+str.substring(index+2, str.length())) ;
	}
}
