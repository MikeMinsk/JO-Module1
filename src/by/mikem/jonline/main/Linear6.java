package by.mikem.jonline.main;

import java.util.Scanner;

/*
 *  Для данной области составить линейную программу, которая печатает true, если точка с координатами
 *   (х, у) принадлежит закрашенной области, и false — в противном случае.
 */

public class Linear6 {

	public static void main(String[] args) {
		double[] xValues = { 10, 20, -10, -20 };
		double[] yValues = { 30, -20, -20, 30 };
		double x;
		double y;
		boolean result;

		result = false;
		x = inputConsole("x");
		y = inputConsole("y");

		for (int i = 0; i < 4; i++) {
			if (Math.abs(x) < Math.abs(xValues[i])) {
				if (Math.abs(y) < Math.abs(yValues[i])) {
					result = true;
				} else {
					result = false;
				}
			}
		}

		System.out.print(result);
	}

	public static double inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for coordinate " + variable + " >> ");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a value for coordinate " + variable + " >> ");
		}

		return sc.nextDouble();
	}
}
