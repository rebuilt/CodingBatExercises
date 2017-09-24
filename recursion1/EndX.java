/*
 * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
 */

package recursion1;
public class EndX {

	public static void main(String[] args){
		String str = "xhixhix";
		System.out.print(endX(str));
	}

	public static  String endX(String str) {
		int length = str.length();
		System.out.println(str);

		if(length <= 1 ){
			return str;
		}

		if(str.charAt(0)== 'x'){
			return endX(str.substring(1,length))+ "x";
		}
		
		return str.substring(0,1) + endX(str.substring(1,length));
	}

}
