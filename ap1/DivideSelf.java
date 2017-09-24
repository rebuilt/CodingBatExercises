package ap1;

public class DivideSelf {

	public static void main(String[] args) {
		System.out.println(dividesSelf(128));
	}
	
	public static boolean dividesSelf(int n) {
		String number = "" + n;
		
		if(number.contains("0")) {
			return false;
		}
		int num = n;
		int remainder = 0;
		while(num> 0 ) {
			if((n % (remainder = num%10)) != 0) {
				System.out.println(num);
				System.out.println(remainder);
				return false;
			}
			num = num/10;
		}
		
		return true;
	}
}
