package Lab01;

public class Exe66 {
	static void display2DMatrix(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] firstMatrix = {{1, 2, 3}, {1, 4, 5}, {2, 4, 1}, {9, 1, 3}};
		int[][] secondMatrix = {{6, 7, 2}, {3, 5, 10}, {4, 1, 1}, {0, -1, -3}};
		System.out.println("Matrix 1:");
		display2DMatrix(firstMatrix);
		System.out.println("Matrix 2:");
		display2DMatrix(secondMatrix);
		int rows = firstMatrix.length;
		int cols = firstMatrix[0].length;
		int[][] sumOfMatrices = new int[rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				sumOfMatrices[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		System.out.println("Sum of 2 matrices:");
		display2DMatrix(sumOfMatrices);
	}
}
