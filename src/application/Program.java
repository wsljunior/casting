package application;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("******* Casting *******");
		int valueA = 5;
		int valueB = 2;
		double valueC = 20.5;
		int valueD;
		double result;
		result = valueA / valueB;
		System.out.println(result);
		System.out.println("\n");
		result = (double) valueA / valueB;
		System.out.println(result);
		System.out.println("\n");
		valueD = (int) valueC;
		System.out.println(valueD);

	}

}
