package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Calculator c = new Calculator(null);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Result: " + c.add(a,b));
		sc.close();
	}
}
