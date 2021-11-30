package by.jonline.module1.cycle;

/*найти произведение квадратов первых двухсот чисел*/

public class Number_4 {

	public static void main(String[] args) {
		long n = 1;

		for (int i = 1; i <= 200; i++) {
			if (n * (i * i) < 0) {
				System.out.println("На " + i + "м шаге произойдет переполнение long при умножении " + n + " на " + i
						+ " в квадрате, итоговый результат будет некорректен!");
				
				break;
			}

			n = n * (i * i);

			if (i == 200) {
				System.out.println(n);
			}

		}

	}

}
