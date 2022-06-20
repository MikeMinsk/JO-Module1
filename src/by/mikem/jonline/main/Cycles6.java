package by.mikem.jonline.main;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера. 
 */

public class Cycles6 {

	public static void main(String[] args) {
		char ch;

		for (int i = 1; i < Math.pow(2, 16); i++) {
			ch = (char) i;

			System.out.print(ch + " - " + i + ";  ");

			if (i % 30 == 0) {
				System.out.println("");
			}
		}
	}
}
