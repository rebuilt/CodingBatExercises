package scratch;

public class StringYak {
	public static void main(String[] args){
		String[] words = {"yakpak", "pakyak", "yak123ya"};
		for(int i = 0; i < words.length; i ++){
			System.out.println(stringYak(words[i]));	
		}
	}

	public static String stringYak(String str) {
		char[] chars = str.toCharArray();
		String out = "";
		for(int i = 0 ; i< chars.length; i++) {
			if(chars[i] == 'y') {
				if(i+2 < chars.length) {
					if(chars[i+2]== 'k') {
						i = i+2;
						continue;
					}
				}
			}
			out += chars[i];
		}
		
		return out;
	}
	


}