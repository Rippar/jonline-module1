package by.jonline.module1.cycle;

/*Вывести на экран соответствие между символами и их численными обозначениями*/

public class Number_6 {

	public static void main(String[] args) {
		
		for (int i = 33; i <= 127; i++) { // Первые 32 символа являются управляющими (на экран ничего не выводится)
			System.out.print(i + ": ");
			System.out.println((char) i);
		}

	}

}
