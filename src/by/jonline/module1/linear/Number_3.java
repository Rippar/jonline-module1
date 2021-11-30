package by.jonline.module1.linear;

import java.util.Locale;
import java.util.Scanner;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения */

public class Number_3 {

	public static void main(String[] args) {
		double x;
		double y;

		double firstPart;
		double secondPart;
		double result;

		x = enterFromConsole();
		y = enterFromConsole();

		firstPart = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
		secondPart = Math.sin(x * y) / Math.cos(x * y);

		result = firstPart / secondPart;

		System.out.println(result);
	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		System.out.println("Введите вещественное число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести вещественное число!: ");

		}
		return sc.nextDouble();
	}

}
