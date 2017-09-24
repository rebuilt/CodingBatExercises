package scratch;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	sayHello();
		//String[] words = {"kitten", "Chocolate", "CodingHorror", "yak","ya","y","","ThisThatTheOther"};
		String[] words = { "CodingHorr","codingorr", "CodingHorror","ThisThatTheOther"};
		
		for(int i = 0 ; i < words.length; i++) {
			
			System.out.println(sayHello(words[i]));
			
		}
	}

	public static String sayHello(String str) {
	  	String out = "";
			boolean[] bools = {true, true, false, false, true, true, false, false, true, true}; 
			//0,1, 4,5, 8,9
			
				if(str.length()>= 10) {
				char[] ch = str.toCharArray();
				System.out.println(ch.toString());
				out = String.valueOf(ch[0])+ ch[1]+ ch[4]+ch[5]+ch[8]+ch[9] ;
				return out;
			}
			

			for(int i = 0; i< str.length(); i++) {
				if(bools[i]) {
					out += str.charAt(i);
				}
			}
			
		
			return out;
	}
}
