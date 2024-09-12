package bs;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {

		int[] myArray = { 5, 5, 2, 2, 2, 2, 5 };
		Leet169 myLeet = new Leet169();
		System.out.println(myLeet.majorityElement(myArray));
	}

}
