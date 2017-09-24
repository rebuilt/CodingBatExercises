public class CopyEndy{
	public static void main(String[] args){
		int[] nums = {9, 11, 90, 22, 6};
		int count = 3;
		nums = copyEndy(nums, count);

		for ( int i = 0; i < nums.length; i++){
			System.out.print(nums[i]+", " );
		}
	}

	public static int[] copyEndy(int[] nums, int count){
		int[] out = new int[count];

		int index = 0;
		
		for(int i = 0; i< nums.length; i++){
			if(isEndy(nums[i])){
				out[index] = nums[i];
				index++;
				if(index==count){
					break;
				}
			}
		}

		return out; 

	}

	public static boolean isEndy(int num){
		
		if( num < 0 || ( num > 10 && num < 90 ) || num > 100){

			return false;
		}


		return true;


	}

}
