package bs;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {

		Leet26 myLeet = new Leet26();
		int[] myArray = {1,2,2,2,2,3,3,3,3,3,4,5,6};
		int[] myArray2 = {1,1};
		
		System.out.println("Unique: " + myLeet.removeDuplicates(myArray));
		for (int i : myArray) System.out.print(i);
	}
}
