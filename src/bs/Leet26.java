package bs;

public class Leet26 {

	public int removeDuplicates(int[] nums) {

		int k = 0;

		if (nums.length != 1) {

			for (int i = 1; i < nums.length; i++) {
				if (nums[k] < nums[i]) {
					nums[++k] = nums[i];
				}
			}

		} else {
			k = 1;
		}
		return k + 1;

	}

}
