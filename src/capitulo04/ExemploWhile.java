package capitulo04;

public class ExemploWhile {
	public static void main(String[] args) {
		System.out.println("Exibindo o laço while");
		int x = 10;
		
		while(x < 10) {
			System.out.println("Olá While!");
			x++;
		}
		
		System.out.println("Exibindo o laço do/while");
		int y = 10;
		
		do {
			System.out.println("Olá Do/While");
			y++;
		}while(y<10);
	}
}
