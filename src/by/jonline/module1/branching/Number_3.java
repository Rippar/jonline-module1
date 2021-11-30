package by.jonline.module1.branching;

import java.util.Locale;
import java.util.Scanner;

/*Даны три точки A(x1, y1), B(x2, y2) и С(х3, у3). Определить, будут ли они расположены на одной прямой*/

public class Number_3 {

	public static void main(String[] args) {
		double x1;
		double y1;

		double x2;
		double y2;

		double x3;
		double y3;

		x1 = enterFromConsole();
		y1 = enterFromConsole();

		x2 = enterFromConsole();
		y2 = enterFromConsole();

		x3 = enterFromConsole();
		y3 = enterFromConsole();

		if (((x1 - x3) / (x2 - x3)) == (y1 - y3) / (y2 - y3)) {
			System.out.println("Точки лежат на одной прямой");

		} else {
			System.out.println("Точки не лежат на одной прямой");
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
