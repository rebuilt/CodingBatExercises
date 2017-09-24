package scratch;

public class BigHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {5, 3, 6, 7, 2};
		int start = 2;
		int end = 4;
		
		System.out.println(bigHeights(heights, start, end));
	}
	public static int bigHeights(int[] heights, int start, int end) {
		int count = 0;
		for(int i = start; i < end ; i ++)
		{
			int height = Math.abs(heights[i]- heights[i+1]);
			
			if( height >= 5 ) {
				count++;
			}
		}
		
		
		  return count;
		  
	}
}
