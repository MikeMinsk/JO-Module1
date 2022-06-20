package by.mikem.jonline.main;

import java.math.BigInteger;

/* 
 * Составить программу нахождения произведения квадратов первых двухсот чисел. (прим. - натуральных?).
 */

public class Cycles4 {

	public static void main(String[] args) {
		int maxNumber;
		BigInteger temp;
		BigInteger sumFinal;

		maxNumber = 200;
		temp = new BigInteger("0");
		sumFinal = new BigInteger("1");

		for (int i = 1; i <= maxNumber; i++) {
			temp = BigInteger.valueOf(i);
			temp = temp.multiply(temp);
			sumFinal = temp.multiply(sumFinal);
		}

		System.out.println("Required sum = " + sumFinal.toString());
	}
}