package capitulo04;

public class OutrosComandos {
	public static void main(String[] args) {
		int x = 0, y = 0;
		
		while(x < 5) {
			x++;
			System.out.println("Laço principal: " + x);
			
			while (y < 10) {
				y++;
				if (y % 2 == 0) {
					System.out.println("\t- Laço secundario: " + y);
				}else {
					continue; // PULA PARA A PROXIMA EXECUÇAO DO LAÇO
				}
			
			}
			y = 0;
			if (x == 4) {
				break; //INTERROMPE O LAÇO QUE ELE PERTENCE
			}
		}
	}
}
