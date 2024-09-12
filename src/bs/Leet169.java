package bs;

public class Leet169 {

	public int majorityElement(int[] nums) {

		int current = 0, counter = 0;

		for (int i : nums) {
			if (counter == 0)
				current = i;
			if (current == i)
				counter++;
			else
				counter--;
		}

		return current;
	}

}
