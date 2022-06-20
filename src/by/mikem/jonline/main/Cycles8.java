package by.mikem.jonline.main;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Cycles8 {

	public static void main(String[] args) {
		long m;
		long n;
		ArrayList<Long> mNumbers;
		ArrayList<Long> nNumbers;

		mNumbers = new ArrayList<Long>();
		nNumbers = new ArrayList<Long>();
		m = inputConsole("m");
		n = inputConsole("n");

		mNumbers = numberParser(m);
		nNumbers = numberParser(n);

		System.out.print("Same digits in the numbers are: ");

		for (long mArray : mNumbers) {
			if (nNumbers.contains(mArray)) {
				System.out.print(mArray + ", ");
				while (nNumbers.contains(mArray)) {
					nNumbers.remove(mArray);
				}
			}
		}
	}

	public static long inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for " + variable + " >> ");

		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print("Enter a value for " + variable + " >> ");
		}

		return sc.nextLong();
	}

	public static ArrayList<Long> numberParser(long number) {
		ArrayList<Long> parserResult;
		long residue;

		parserResult = new ArrayList<Long>();
		residue = 0;
		number = Math.abs(number);

		while (number > 0) {
			residue = number % 10;
			parserResult.add(residue);
			number = (number - residue) / 10;
		}

		return parserResult;
	}
}
