package calculator;

import java.util.Scanner;

public class Calculator {

	public static double addition(double a, double b) {
		double result = a + b;
		return result;
	}

	public static double substraction(double a, double b) {
		double result = a - b;
		return result;
	}

	public static double multiplication(double a, double b) {
		double result = a * b;
		return result;
	}

	public static double division(double a, double b) {
		double result = a / b;
		return result;
	}

}

class CalculatorDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(" Choose operation");
			System.out.println(" 1. Addition");
			System.out.println(" 2. Substraction");
			System.out.println(" 3. Multiplication");
			System.out.println(" 4. Division");
			System.out.println(" Exit?");

			String number = sc.next();

			System.out.println("Enter the inputs");
			double a = sc.nextDouble();
			double b = sc.nextDouble();

			double answer = 0;
			switch (number) {
			case "1":
				answer = Calculator.addition(a, b);
				break;
			case "2":
				answer = Calculator.substraction(a, b);
				break;
			case "3":
				answer = Calculator.multiplication(a, b);
				break;
			case "4":
				answer = Calculator.division(a, b);
				break;
			case "exit":
				System.out.println(" Exiting the calculator \n");
				break;
			default:
				System.out.println(" Invalid output");
				continue;
			}

			System.out.println("Result:" + answer + "\n");
			System.out.println("Do you want to continue");
			char ch1 = sc.next().charAt(0);
			if (ch1 == 'Y' || ch1 == 'y') {
				System.out.println("start again");
			}

			else {
				break;
			}
		}

	}
}
