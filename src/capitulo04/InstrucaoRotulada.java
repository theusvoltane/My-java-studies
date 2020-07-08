package capitulo04;

public class InstrucaoRotulada {
	public static void main(String[] args) {
		int x = 0, y = 0;
		
		principal:
		while(x < 5) {
			x++;
			System.out.println("Laço principal: " + x);
			
			while (y < 8) {
				y++;
				if (y == 5) {
					y = 0;
					continue principal; // PULA PARA A PROXIMA EXECUÇAO DO LAÇO
				}
				System.out.println("\t- Laço secundario: " + y);
			}	
		}		
	}
}
