package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Linear5 {

	public static void main(String[] args) {
		long inputFromConsole;
		long hours;
		long minutes;
		long seconds;
		long residue;

		inputFromConsole = inputConsole("T");

		while (inputFromConsole < 1 || inputFromConsole > Long.MAX_VALUE) {
			inputFromConsole = inputConsole("T");
		}

		hours = inputFromConsole / 3600L;
		residue = inputFromConsole - hours * 3600L;
		minutes = residue / 60L;
		residue = residue - minutes * 60L;
		seconds = residue;

		System.out.println("Result: " + hours + "ч " + minutes + "м " + seconds + "с.");
	}

	public static long inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a natural number " + variable + " >> ");

		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print("Enter a natural number " + variable + " >> ");
		}

		return sc.nextLong();
	}
}
