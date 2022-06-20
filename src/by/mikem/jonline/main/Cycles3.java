package by.mikem.jonline.main;

/* 
 * Найти сумму квадратов первых ста чисел (прим. - натуральных?).
 */

public class Cycles3 {

	public static void main(String[] args) {
		int maxNumber;
		int sum;
		
		maxNumber = 100;
		sum = 0;
		
		for (int i = 1; i <= maxNumber; i++) {
			sum += Math.pow(i, 2);
		}
		
		System.out.println("Required sum = " + sum);
	}
}
