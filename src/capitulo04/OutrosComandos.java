package capitulo04;

public class OutrosComandos {
	public static void main(String[] args) {
		int x = 0, y = 0;
		
		while(x < 5) {
			x++;
			System.out.println("La�o principal: " + x);
			
			while (y < 10) {
				y++;
				if (y % 2 == 0) {
					System.out.println("\t- La�o secundario: " + y);
				}else {
					continue; // PULA PARA A PROXIMA EXECU�AO DO LA�O
				}
			
			}
			y = 0;
			if (x == 4) {
				break; //INTERROMPE O LA�O QUE ELE PERTENCE
			}
		}
	}
}
