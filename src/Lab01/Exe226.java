package Lab01;

import java.lang.Math;
public class Exe226 {

	public static void sovleFirstDegreeEquation(double a, double b){
		if (a==0){
			if (b==0) {			
				System.out.println("The equation "+a+"*x + "+b+" = 0 has infinitely many solutions");
			} else {
				System.out.println("The equation "+a+"*x + "+b+" = 0 has no solution");
			}
		} else {
			double sol = -b/a;
			System.out.println("Solution of the equation "+a+"*x + "+b+" = 0 is x = "+sol);
		}
	}
	public static void sovleSystemOfFirstDegreeEquations(double a11, double a12, double b1, double a21, double a22, double b2) {
		double D = a11*a22 - a12*a21, D1 = b1*a22-b2*a12, D2 = b2*a11-b1*a21;
		if (D == 0){
			if (D1 == 0){
				System.out.println("The system of equations "+a11+"*x1 + "+a12+"*x2 = "+b1+" = 0 and" + a21+"*x1 + "+a22+"*x2 = "+b2+" = 0 has infinitely many solutions");
			} else {
				System.out.println("The system of equations "+a11+"*x1 + "+a12+"*x2 = "+b1+" = 0 and" + a21+"*x1 + "+a22+"*x2 = "+b2+" = 0 has no solution");
			}
		} else {
			System.out.println("The solution of system of equations "+a11+"*x1 + "+a12+"*x2 = "+b1+" = 0 and " + a21+"*x1 + "+a22+"*x2 = "+b2+" = 0 is (x1, x2) = ("+(D1/D)+", "+(D2/D)+")");
		}
	}
	public static void sovleSecondDegreeEquation(double a, double b, double c){
		if (a==0){
			if (b==0){
				if (c==0) {			
					System.out.println("The equation "+a+"*x^2 + "+b+"*x + "+c+" = 0 has infinitely many solutions");
				} else {
					System.out.println("The equation "+a+"*x^2 + "+b+"*x + "+c+" = 0 has no solution");
				}
			} else {
				double sol = -c/b;
				System.out.println("Solution of the equation "+a+"*x^2 + "+b+"*x + "+c+" = 0 is x = "+sol);
			}
		} else {
			double delta = b*b - 4*a*c;
			if (delta < 0){
				System.out.println("The equation "+a+"*x^2 + "+b+"*x + "+c+" = 0 has no solution");
			} else if (delta == 0) {
				System.out.println("Solution of the equation "+a+"*x^2 + "+b+"*x + "+c+" = 0 is x = "+(-b/(2*a)));
			} else {
				double x1 = (-b+Math.sqrt(delta))/(2*a);
				double x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("Solutions of the equation "+a+"*x^2 + "+b+"*x + "+c+" = 0 are x1 = "+x1+ " and x2 = "+x2);
			}
		}
	}

	public static void main(String[] args){
		sovleFirstDegreeEquation(0, 2);
		sovleSystemOfFirstDegreeEquations(1, 1, 3, 3, 2, 8);
		sovleSecondDegreeEquation(1, 2, 1);
		System.exit(0);
	}
}
