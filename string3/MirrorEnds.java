/*
 * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
*/

package string3;
public class MirrorEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "xxYxx";
		System.out.println(mirrorEnds(string));
	}
	public static String mirrorEnds(String string) {
		  String output = "";
		 
		  char[] word = string.toCharArray();
		  int end = word.length-1;
		  for (int i = 0; i <= end; i ++) {
			  if(word[i] == word[end-i]) {
				  output += word[i];
			  }else {
				  break;
			  }
		  }
		  return output;
				  
	}
}
