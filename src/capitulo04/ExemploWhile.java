package capitulo04;

public class ExemploWhile {
	public static void main(String[] args) {
		System.out.println("Exibindo o la�o while");
		int x = 10;
		
		while(x < 10) {
			System.out.println("Ol� While!");
			x++;
		}
		
		System.out.println("Exibindo o la�o do/while");
		int y = 10;
		
		do {
			System.out.println("Ol� Do/While");
			y++;
		}while(y<10);
	}
}
