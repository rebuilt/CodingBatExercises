package ap1;
public class MatchUp{
	public static void main(String[] args){
		String[] first = {"aa", "bb", "cc"};
		String[] second ={"aaa", "xx", "bb"};
		
		System.out.println(matchUp(first, second));
		
	}

	public static int matchUp(String[] a, String[] b) {
		int count = 0;

		for(int i = 0; i< a.length; i++){
			
			if(a[i].charAt(0)==b[i].charAt(0)){
				count++;
			}
		}

		return count;
	}
		
}
