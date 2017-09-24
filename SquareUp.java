package scratch;

public class SquareUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int square = 4;
		int iterations = 1000000000;
		Utils.print(squareUp(square));
		Utils.startTimer();
		for (int j = 0; j < iterations ; j ++) {
		squareUp(square);
		}
		Utils.stopTimer();
		
		Utils.startTimer();
		for(int i = 0; i < iterations ; i ++) {
		squareUp2(square);
		}
		Utils.stopTimer();
	}

	public static int[] squareUp(int n) {
		
		int[] out = new int[n * n];
		if (n == 0) {
			return out;
		}
		
		for (int row = 0; row < n; row++) {
			for (int column = n - 1; column >= 0; column--) {
				if (n - column <= row + 1) {
					out[row*n+column] = n-column;
				} else {
					out[row*n + column] = 0;
				}

			}
		}

		
		return out;

	}

	public static int[] squareUp2(int n) {
		int[] arr = new int[n * n];
		
		if (n == 0)
			return arr;
		
		for (int i = n - 1, j = 1; i < arr.length;) {
			arr[i] = j;
			j--;
			if (j == 0 && i < arr.length - 1) {
				j = ((i + 1) / n) + 1;
				i += n - ((i + 1) / n);
			} else {
				i++;
			}
		}
		return arr;
	}

}
