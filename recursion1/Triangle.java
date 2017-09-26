/*
 * We have Triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a Triangle with the given number of rows.

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
*/

package recursion1;

public class Triangle {

	public static void main(String[] args) {
		int rows = 3;
			System.out.print(triangle(rows));
	}
	public static int triangle(int rows) {
		  if (rows <=1) {
			  return rows;
		  }
		  
		return  rows + triangle(rows -1) ;
	}

}
