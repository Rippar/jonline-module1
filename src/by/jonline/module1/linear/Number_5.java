package by.jonline.module1.linear;

import java.util.Scanner;

/* Дано натуральное число time в секундах. Вывести данное значение в часах, минутах и секундах в формате ННч ММмин SSсс */

public class Number_5 {

	public static void main(String[] args) {
		int time;
		int s;
		int m;
		int h;

		time = enterFromConsole();
		s = time % 60;
		m = time % (60 * 60) / 60;
		h = time % (60 * 60 * 24) / (60 * 60);
		
		if (time>=0) {
		    System.out.println(h + "ч " + m + "м " + s + "с ");
		    
		} else {
			System.out.println("Нужно было ввести целое положительное число!");
		}

	}

	public static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое положительное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое положительное число!: ");
		}

		return sc.nextInt();

	}

}
