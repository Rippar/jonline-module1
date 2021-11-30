package by.jonline.module1.linear;

import java.util.Scanner;

/*Найдите значение функции z = ((a - 3) * b / 2) + c */

public class Number_1 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		double z;

		a = enterFromConsole();
		b = enterFromConsole();
		c = enterFromConsole();

		z = ((a - 3) * b / 2.0) + c;

		System.out.println(z);

	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число!: ");

		}
		return sc.nextInt();
	}
}
