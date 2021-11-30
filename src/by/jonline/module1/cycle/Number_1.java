package by.jonline.module1.cycle;

import java.util.Scanner;

/*Ввести любое целое положительное число n и просумировать все числа от 1 до n */

public class Number_1 {

	public static void main(String[] args) {
		long n;
		long sum = 0;

		n = enterFromConsole();

		if (n > 0) {

			for (long i = 1; i <= n; i++) {

				if (sum + i < 0) {
					System.out.println("На " + i + "м шаге произойдет переполнение long при суммировании " + sum + " и "
							+ i + ". Итоговый результат будет некорректен!");
					break;
				}

				sum += i;
							
				if (i==n) {
				    System.out.println("Сумма чисел равна " + sum);
				}
			}
				

		} else {
			System.out.println("Требовалось ввести целое положительное число!");
		}

	}

	public static long enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое положительное число:  ");
		while (!sc.hasNextLong()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!: ");

		}
		return sc.nextLong();
	}

}
