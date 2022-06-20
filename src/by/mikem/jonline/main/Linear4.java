package by.mikem.jonline.main;

import java.util.Scanner;

/* 
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Linear4 {

	public static void main(String[] args) {
		float inputFromConsole;
		float fractionalPart;
		int wholePart;
		float result;

		inputFromConsole = inputConsole("nnn.ddd");

		wholePart = (int) inputFromConsole;
		fractionalPart = inputFromConsole - wholePart;
		result = Math.round(fractionalPart * 1000) + (wholePart / 1000.0f);

		System.out.println("Result of the swap: " + result);
	}

	public static float inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for " + variable + " >> ");

		while (!sc.hasNextFloat()) {
			sc.nextLine();
			System.out.print("Enter a value for " + variable + " >> ");
		}

		return sc.nextFloat();
	}
}
