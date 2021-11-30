package by.jonline.module1.cycle;

import java.util.Locale;
import java.util.Scanner;

/*Вычислить значения функции y = x при x > 2, либо y = -x при x <= 2 на отрезке [a,b] с шагом h */

public class Number_2 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;

		a = enterFromConsole();
		b = enterFromConsole();
		h = enterFromConsole();

		if (a <= b && h >= 0) {

			System.out.println("Значения функции на отрезке [" + a + "," + b + "] с шагом " + h + ": ");

			for (double x = a; x <= b; x += h) {

				if (x > 2) {
					System.out.print(x + "; ");

				} else {
					System.out.print((-1) * x + "; ");
				}

				if (h == 0)
					break;
			}

		} else if (a > b && h >= 0) {

			System.out.println("Значения функции на отрезке [" + a + "," + b + "] с шагом " + h + ": ");

			for (double x = a; x >= b; x -= h) {

				if (x > 2) {
					System.out.print(x + "; ");

				} else {
					System.out.print((-1) * x + "; ");
				}

				if (h == 0)
					break;
			}
		} else {
			System.out.println("Значение шага h не может быть отрицательным числом!");
		}
	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// используется, чтобы вводить в консоль вещественные числа через точку (по
		// умолчанию ввод через запятую)
		sc.useLocale(Locale.ENGLISH);

		System.out.println("Введите число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести число!: ");

		}
		return sc.nextDouble();
	}

}
