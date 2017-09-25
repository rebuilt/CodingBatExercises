/*
 * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/

package string3;
public class MaxBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hoopla";
		
System.out.print(maxBlock(str));
	}
	public static int maxBlock(String str) {
	       int max   = 0;
			    
		  if(str.length() == 0){
			return max;
		  }

			
			char[] word = str.toCharArray();
			char lastChar = word[0];
			max = 1;
			int count = 1;
			for (int i = 1 ; i < word.length ; i++){
				
				if(lastChar == word[i]){


					count++;
					if(count> max ){
					max = count;
					}
					
				}else{
					if(count> max ){
					max = count;
					}
					count = 1;
					lastChar = word[i];
				}

			}
		  return max ;
	}
}
