package capitulo02;

import java.util.ArrayList;

public class Wrappers {
	public static void main(String[] args) {
		String numberText = "346";
		int number;
		
		number = Integer.parseInt(numberText);
		System.out.println(number);
		
		Integer newNumber = number;
		System.out.println(newNumber);
		
		//TIPOS DE WRAPPERS
		Byte b = 10;
		Short s = 100;
		Integer i = 1000;
		Long l = 123450l;
		
		Float f = 123.5f;
		Double d = 1234.87;
		
		Boolean teste = true;
		
		Character letra = 'D';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(teste);
		System.out.println(letra);
		
		
		ArrayList<Double> salarios = new ArrayList<>();
		System.out.println(salarios);
		
	}

}
