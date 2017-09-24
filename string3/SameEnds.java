package string3;
public class SameEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "asdfxxsdfxxasdf";
		
		System.out.println(sameEnds(str));
	}
	public static String sameEnds(String str) {
		String output = "";  
		
		
		String first = str.substring(0, str.length()/2);
		
		String second = "";
		
		if(str.length() % 2 == 1) {
			second =str.substring(str.length()/2+1, str.length());
		}else {

			second  = str.substring(str.length()/2, str.length());
		}
		boolean run = true;
		while(run) {
			if(first.indexOf(second)== 0) {
				output = second;
				run = false;
			}
			else {
				second = second.substring(1);
			}
			
		}
		

		
		return output;
	}

}
