package array3;

public class MaxMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 8, 9, 3, 2, 1 };

		System.out.println(maxMirror(nums));
	}

	public static int maxMirror(int[] nums) {
		int max = 0;
		int count = 0;
		for(int i = 0; i < nums.length; i ++) {
			for(int j = nums.length-1; j >= 0 ; j --) {
			int tmp =i;
			int tmp2 = j;
			while( tmp < nums.length && tmp2 >= 0 && nums[tmp] ==nums[tmp2]) {
				tmp++;
				tmp2--;
				count++;
			}
			if(count> max) {
				max = count;
			}
			count = 0;
			}
			
		}
		
		return max;

	}

}
