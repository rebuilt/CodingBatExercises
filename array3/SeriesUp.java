package array3;
public class SeriesUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Utils.print(seriesUp(3));
	}
	public static int[] seriesUp(int n) {
		int[] out = new int [ n*(n+1)/2];
	 	int count = 0;
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < i+1; j++) {
			out[count] = j+1;
			count ++;
			}
		}
		
		return out;
		  
	}

}
