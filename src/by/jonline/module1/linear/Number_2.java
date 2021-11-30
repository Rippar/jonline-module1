package by.jonline.module1.linear;

import java.util.Locale;
import java.util.Scanner;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения */

public class Number_2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		double firstPart;
		double secondPart;
		double result;

		a = enterFromConsole();
		b = enterFromConsole();
		c = enterFromConsole();

		firstPart = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a;

		secondPart = a * a * a * c + 1 / (b * b);

		result = firstPart - secondPart;

		System.out.println(result);

	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// используется, чтобы вводить в консоль вещественные числа через точку (по умолчанию ввод через запятую)
		sc.useLocale(Locale.ENGLISH); 

		System.out.println("Введите вещественное число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести вещественное число!: ");

		}
		return sc.nextDouble();
	}

}
