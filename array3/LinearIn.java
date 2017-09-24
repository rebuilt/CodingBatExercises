package array3;

public class LinearIn {

	public static void main(String[] args) {
		int[] outer = {
				1, 2, 4, 6
		};
		int[] inner = {2, 3, 4};
		
		System.out.println(linearIn(outer, inner));
	}
	
	public static boolean linearIn(int[] outer, int[] inner) {
		int index = 0;
		boolean[] found = new boolean[inner.length];
		
		 for(int i = 0; i < inner.length; i++) {
			 for(int j = index; j < outer.length; j ++) {
				 if(inner[i] == outer[j]) {
					 found[i] = true;
					 break;
				 }else {
					 found[i] = false;
				 }
				 
				 index = j+1;
				
			 }
			 
		 }
		for(int k = 0; k < found.length; k ++) {
			if(found[k] == false) {
				return false;
			}
		}
		return true;
	}


}
