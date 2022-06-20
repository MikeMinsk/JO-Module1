package by.mikem.jonline.main;

import java.util.Scanner;

/*
 *  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен 
 *  заданному е. Общий член ряда имеет вид:
 */

public class Cycles5 {

	public static void main(String[] args) {
		double e;
		int n;
		double sum;
		double aTemp;

		sum = 0;
		n = 0;

		e = inputConsole("e");
		while (e <= 0) {
			e = inputConsole("e");
		}

		while (true) {
			aTemp = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if (Math.abs(aTemp) >= e) {
				sum += aTemp;
				n++;
			} else {
				break;
			}
		}

		System.out.print("Required sum = " + sum);
	}

	public static double inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for " + variable + " >> ");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a value for " + variable + " >> ");
		}

		return sc.nextDouble();
	}
}
