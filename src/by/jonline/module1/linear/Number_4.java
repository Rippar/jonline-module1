package by.jonline.module1.linear;

import java.util.Locale;
import java.util.Scanner;

/*Дано число вида nnn.ddd. Поменять местами дробную и целую части числа и вывести полученное значение числа*/

public class Number_4 {

	public static void main(String[] args) {
		double num;
		double newNum;

		num = enterFromConsole();
		newNum = num * 1000 % 1000 + (int) num / 1000.0;

		System.out.println(newNum);

	}

	public static double enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); 

		System.out.println("Введите вещественное число вида nnn.ddd (например, 123.456): ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Нужно ввести вещественное число вида nnn.ddd (например, 123.456)!: ");

		}
		return sc.nextDouble();
	}

}
