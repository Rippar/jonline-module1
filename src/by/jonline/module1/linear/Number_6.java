package by.jonline.module1.linear;

import java.util.Locale;
import java.util.Scanner;

/*принаджедит ли точка с координатами (x,y) заданной области x[-4;4] y[-3;4] */

public class Number_6 {

	public static void main(String[] args) {
		double maxX;
		double minX;
		double maxY;
		double minY;

		double x;
		double y;

		maxX = 4;
		minX = -4;
		maxY = 4;
		minY = -3;

		x = enterFromConsole();
		y = enterFromConsole();

		if ((x <= maxX && x >= minX) && (y <= maxY && y >= minY)) {
			System.out.println(true);

		} else {
			System.out.println(false);
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
