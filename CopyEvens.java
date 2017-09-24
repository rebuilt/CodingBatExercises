package scratch;

public class CopyEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3, 2, 4, 5, 8};
		int count = 2;
		nums = copyEvens(nums, count);
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
	
	public static int[] copyEvens(int[] nums, int count) {
	    int[] out = new int[count];
		int counter = 0;
	   
		for(int i = 0; i < nums.length; i ++) {
	    	  if((nums[i] % 2) == 0 ) {
	    		  out[counter] = nums[i]; 
	    				  counter ++;
	    				  if(counter == count) {
	    					break;   
	    				  }
	    	  }
			
	    }
		
		return out;
	}

}
