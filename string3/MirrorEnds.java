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
