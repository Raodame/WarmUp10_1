/* WarmUp 10_1
 * Create an integer array of size 4, placing any 4 numbers
 * you want into the array. Print out the array so that it
 * looks like [1,5,7,3]. Then increase each element of the 
 * array by 1 and re-print, [2,6,8,4]
 */


import java.util.Arrays;

public class WarmUp10_1 {

	public static void main(String[] args) {

		int apple[] = {1, 5, 7, 3};
//		System.out.println(Arrays.toString(apple));

		System.out.print("[");
		for (int x = 0; x < apple.length; x++) {
			System.out.print(apple[x]);
			if (x != apple.length - 1)
				System.out.print(",");
		}
		System.out.println("]");

		for (int x = 0; x < apple.length; x++)
			apple[x]++;

		System.out.print("[");
		for (int x = 0; x < apple.length; x++) {
			System.out.print(apple[x]);
			if (x != apple.length - 1)
				System.out.print(",");
		}
		System.out.println("]");

		System.out.print("[");
		for (int x = apple.length - 1; x >= 0; x--) {
			System.out.print(apple[x]);
			if (x != apple.length)
				System.out.print(","); //how to print commas correct?
		}
		System.out.println("]");

//		System.out.println(Arrays.toString(apple));


			double pear[];
			pear = new double[3];

			pear[0] = 1.1;
			pear[1] = 2.2;
			pear[2] = 3.3;

			System.out.println("\n" + Arrays.toString(pear));

			String banana[] = new String[2];

			banana[0] = "yellow";
			banana[1] = "brown";

			System.out.println(Arrays.toString(banana));
		}
	}

