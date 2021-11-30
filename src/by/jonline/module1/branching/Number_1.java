package by.jonline.module1.branching;

import java.util.Locale;
import java.util.Scanner;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным*/

public class Number_1 {

	public static void main(String[] args) {
		double angle1;
		double angle2;

		angle1 = enterFromConsole();
		angle2 = enterFromConsole();

		if ((angle1 + angle2 < 180) && angle1 > 0 && angle2 > 0) {
			if ((180 - angle1 - angle2 == 90)) {
				System.out.println("Такой треугольник существует. Треугольник прямоугольный");

			} else {
				System.out.println("Такой треугольник существует");
			}
		} else {
			System.out.println("Такого треугольника не существует");
		}

	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// используется, чтобы вводить в консоль вещественные числа через точку (по
		// умолчанию ввод через запятую)
		sc.useLocale(Locale.ENGLISH);

		System.out.println("Введите значение угла треугольника в градусах: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести значение угла треугольника в градусах!: ");

		}
		return sc.nextDouble();
	}

}
