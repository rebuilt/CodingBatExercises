package scratch;

public class Count8 {

	public static void main(String[] args) {
		int n  = 88198;
		System.out.println(count8(n));
	}
	public static int count8(int n) {
		  if(n == 0) return 0;
		  
		  if(n%10 == 8 && (n/10)%10 ==8) {
			  return 2 + count8(n/10);
		  }
		  
		  if(n%10 == 8  ) {
			  return 1 + count8(n/10);
		  }		  
		return count8(n/10);
	}

}
