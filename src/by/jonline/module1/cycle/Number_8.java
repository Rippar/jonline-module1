package by.jonline.module1.cycle;

import java.util.Scanner;

/*Даны два числа. Определить числа, входящие в запись как первого, так и второго числа.*/

public class Number_8 {

	public static void main(String[] args) {
		
		int a = enterFromConsole();
		int b = enterFromConsole();

		while (a > 0) {
			int d = a % 10;
			a /= 10;
			int c = b; 

			while (c > 0) {

				if (d == c % 10) {
					System.out.print(d + " ");
					break; 
				}
				c /= 10;

			}
		}
	}
	
	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число! ");
		}

		return sc.nextInt();

	}

}
