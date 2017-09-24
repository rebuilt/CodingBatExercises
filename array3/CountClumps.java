package array3;
public class CountClumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 2, 1, 1};

		System.out.println(countClumps(nums));
		int iterations = 100000000;
		Utils.startTimer();
		for(int i = 0; i < iterations; i ++) {
			countClumps(nums);
		}
		Utils.stopTimer();
		
		Utils.startTimer();
		for(int i = 0; i < iterations; i ++) {
			countClumps2(nums);
		}
		Utils.stopTimer();
	}

	public static int countClumps(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				continue;
			}
			while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				i++;

			}
			count++;

		}

		return count;

	}
	public static int countClumps2(int[] nums) {
		  boolean isClump = false;
		  int count = 0;
		  for (int i = 0; i < nums.length-1; i++) {
		    if (nums[i] == nums[i+1] && !isClump) {
		      isClump = true;
		      count++;
		    } 
		    else if (nums[i] != nums[i+1]) {
		      isClump = false;
		    }
		  }
		  return count;
		}

}
