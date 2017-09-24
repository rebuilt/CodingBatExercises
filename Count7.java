package scratch;

public class Count7 {

	public static void main(String[] args) {

		int num = 73123471;
System.out.println(count7(num));
	}
	public static int count7(int n) {
		  if(n <= 0){
		    return 0;
		    
		  }
		  int out = 0;
		  
		  if(n%10 == 7 ) {
			  out = 1;
		  }
		  
		  return out + count7(n/10); 
		}

}
