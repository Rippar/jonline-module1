package by.jonline.module1.branching;

import java.util.Locale;
import java.util.Scanner;

/*Вычислить значение функции y = x * x - 3 * x + 9 при x <= 3, либо y = 1 / (x * x * x + 6) при x > 3 */

public class Number_5 {

	public static void main(String[] args) {
		double x;
		double y;

		x = enterFromConsole();

		if (x <= 3) {
			y = x * x - 3 * x + 9;

		} else {
			y = 1 / (x * x * x + 6);
		}

		System.out.println(y);
	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		System.out.println("Введите значение x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести число!: ");

		}
		return sc.nextDouble();
	}

}
