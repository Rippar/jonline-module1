package by.jonline.module1.cycle;

import java.util.Locale;
import java.util.Scanner;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному числу е. Общий член ряда имеет вид: an = 1/ 2^n + 1 / 3^n*/

public class Number_5 {


	public static void main(String[] args) {

		double n; 
		double e;
		double sum = 0;

		n = enterFromConsole();
		e = enterFromConsole();

		if (n > 0 && n % 1 == 0) { 

			for (int i = 1; i <= n; i++) {
				double tmp = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

				if (Math.abs(tmp) >= e) {
					sum += tmp;
				}
			}

			System.out.println("Сумма членов ряда, больших или равных "+e+": "+sum);
			
		} else {
			
			System.out.println("Длина числового ряда должна быть представлена положительным целым числом!");
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
