package capitulo04;

public class InstrucaoRotulada {
	public static void main(String[] args) {
		int x = 0, y = 0;
		
		principal:
		while(x < 5) {
			x++;
			System.out.println("La�o principal: " + x);
			
			while (y < 8) {
				y++;
				if (y == 5) {
					y = 0;
					continue principal; // PULA PARA A PROXIMA EXECU�AO DO LA�O
				}
				System.out.println("\t- La�o secundario: " + y);
			}	
		}		
	}
}
