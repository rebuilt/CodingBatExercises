/*
 * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
*/

package ap1;
public class CommonTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"a", "a", "b", "b", "c"};
		
				String[] b = {"a", "b", "c"};
				System.out.println(commonTwo(a,b));
	}

	public static int commonTwo(String[] a, String[] b) {
		  int out = 0;
		  boolean hasNext = true;
		  int i = 0;
		  int j = 0;
		  
		  String lastWord = "";
		  
		  while(hasNext) {
			   if(a[i].equals(lastWord)) {
				   i++;
				   continue;
			   }
			  if(a[i].compareTo(b[j] ) == 0 ) {
				  out ++;
				  lastWord = a[i];
				  i++;
				 
			  }
			  else if (a[i].compareTo(b[j] ) > 0) {
				  j++;
			  }
			  else {
				  i++;
			  }
			  
			  if(i == a.length ||j == b.length) {
				  hasNext = false;
			  }
		  }
		  
		  return out;
	}

}
