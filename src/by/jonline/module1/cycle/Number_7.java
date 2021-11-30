package by.jonline.module1.cycle;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.*/

public class Number_7 {

	public static void main(String[] args) {

		int m = enterFromConsole();
		int n = enterFromConsole();

		if (n >= m && (m > 0 && n > 0)) {

			for (int i = m; i <= n; i++) {
				System.out.print("Делители для " + i + ": ");

				for (int j = 2; j < i; j++) {

					if (i % j == 0) {
						System.out.print(j + "; ");
					}
				}

				System.out.println("\n");
			}

		} else if (n < m && (m > 0 && n > 0)) {

			for (int i = m; i >= n; i--) {
				System.out.print("Делители для " + i + ": ");

				for (int j = 2; j < i; j++) {

					if (i % j == 0) {
						System.out.print(j + "; ");
					}
				}

				System.out.println("\n");
			}

		} else {
			System.out.println("Следовало ввести натуральные числа!");
		}

	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число:  ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести натуральное число:  ");
		}

		return sc.nextInt();

	}

}
