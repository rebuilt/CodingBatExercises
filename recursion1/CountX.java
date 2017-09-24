package recursion1;

public class CountX{

	public static void main (String[] args){

		String str  = "xhix";

		System.out.println(countX(str));
	}

	public static int countX(String str){

		if(str.length()== 0){
			return 0;
		}
		int count = 0;

		if(str.charAt(str.length()-1) == 'x'){

			count ++;
		}
		return count + countX(str.substring(0, str.length()-1)); 


	}
}
