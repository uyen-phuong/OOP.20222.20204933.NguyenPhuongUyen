package Lab01;
import java.util.Arrays;

public class Exe65 {
	public static void main(String[] args) {
		int arr[] = {1789, 2035, 1899, 1456, 2014};
		Arrays.sort(arr);
		int sumOfArr = 0;
		for (int i: arr) {
			sumOfArr += i;
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Sum of the array: " + sumOfArr);
		System.out.println("Average  of the array: " + (double)sumOfArr/arr.length);
	}
}
