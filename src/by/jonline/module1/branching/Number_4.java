package by.jonline.module1.branching;

import java.util.Locale;
import java.util.Scanner;

/*Заданы размеры a, b прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие.*/

public class Number_4 {

	public static void main(String[] args) {
		double a = 7;
		double b = 3;

		double x;
		double y;
		double z;

		x = enterFromConsole();
		y = enterFromConsole();
		z = enterFromConsole();

		if (x > 0 && y > 0 && z > 0) {

			/* Либо кирпич проходит сторонами x и у, либо x и z, либо y и z */

			if ((x < a && y < b) || (x < b && y < a)) {
				System.out.println("Кирпич пройдет");

			} else if ((x < a && z < b) || ((x < b && z < a))) {
				System.out.println("Кирпич пройдет");

			} else if ((y < a && z < b) || (z < a && y < b)) {
				System.out.println("Кирпич пройдет");

			} else {
				System.out.println("Кирпич не пройдет!");
			}

		} else {
			System.out.println("Значения размеров кирпича должны быть положительными!");
		}
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
