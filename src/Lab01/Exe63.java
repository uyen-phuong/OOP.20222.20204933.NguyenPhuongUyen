package Lab01;
import java.util.Scanner;

public class Exe63 {
	static void triangle(int n) {
		for (int i=1; i<=n; i++) {
			String line = "";
			for (int j=0; j<n-i; j++) {
				line += " ";
			}
			for (int j=0; j<2*i-1; j++) {
				line += "*";
			}
			System.out.println(line);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		sc.close();
		triangle(n);
	}
}
