package scratch;

public class GHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xxgggxygg";

		System.out.println(gHappy(str));
		
		boolean out = false;
		for(int i = 0 ; i< 1000000; i++) {
			out =gHappy (str);
		}
		System.out.println(out);

	}

	public static boolean gHappy(String str) {
		boolean out = true; 

		char[] st = str.toCharArray();
		for(int i = 0; i < st.length; i ++) {

			String tmp = "";
				
				while( i< st.length && st[ i]=='g') {
					
					tmp += 'g';
				i++;
				
				}
				
				if(tmp.equals("g")) {
					return false;
				}
				

		}
		return out;
	}
}