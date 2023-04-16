package Lab01;

import java.util.Scanner;

public class Exe225 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		double firstNum = sc.nextDouble();
		System.out.println("Enter second number:");
		double secondNum = sc.nextDouble();
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
		if (secondNum == 0) {
			System.out.println("Cannot divide by 0");
		} else {
			System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
		}
		sc.close();
	}
}
