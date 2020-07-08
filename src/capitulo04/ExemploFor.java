package capitulo04;

public class ExemploFor {
	public static void main(String[] args) {
		System.out.println("Exibindo a repetição For\n");
		
		for(int x = 5; x <= 10; x++) {
			System.out.println("Olá For");
		}
		
		System.out.println("\nExibindo a repetição For Each\n");
		int[] numeros = {10, 20, 30, 40, 50};
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}
}
