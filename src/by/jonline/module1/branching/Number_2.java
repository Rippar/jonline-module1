package by.jonline.module1.branching;

import java.util.Locale;
import java.util.Scanner;

/*Найти max{min(a,b), min(c,d)}*/

public class Number_2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double max;

		a = enterFromConsole();
		b = enterFromConsole();
		c = enterFromConsole();
		d = enterFromConsole();

		max = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println(max);

	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		System.out.println("Введите число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести число!: ");

		}
		return sc.nextDouble();
	}

}
