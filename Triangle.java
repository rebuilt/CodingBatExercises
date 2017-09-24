package scratch;

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
