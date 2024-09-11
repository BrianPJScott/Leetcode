package bs;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {

		Leet27 leet = new Leet27();
		int[] myArray = {3,2,2,3 };
		int i = leet.removeElement(myArray, 3);
		
		for (int e : myArray) System.out.print(e);
		System.out.println();
		System.out.println(i);

		int[] myArray2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		i = leet.removeElement(myArray2, 2);
		
		for (int e : myArray2) System.out.print(e);
		System.out.println();
		System.out.println(i);
	}

}
