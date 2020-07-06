package capitulo03.laboratorio;

import java.io.IOException;

public class Lab02 {
	public static void main(String[] args) throws IOException {
		int valor = System.in.read();
		if ((valor % 2) == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
	}
}
