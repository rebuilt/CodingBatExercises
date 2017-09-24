package recursion1;
public class Array220 {

	public static void main(String[] args) {

		int[] nums = {1,2,20};
		int index = 0;
		System.out.println(array220(nums, index));
	}
	public static boolean array220(int[] nums, int index) {
		if(index >= nums.length-1){

			return false;
		}
		
	
		if(nums[index]*10 == nums[index+1]){
			return true;
		}

		return array220(nums, index+1);

	}

}
