package capitulo04;

public class ExemploSwitch {
	public static void main(String[] args) {
		String pais = "Fran�a".toUpperCase();
		
		switch(pais) {
		case "BRASIL":
		case "PORTUGAL":
			System.out.println("Bom dia");
			break;
		case "FRAN�A":
			System.out.println("Bon Jour");
			break;
		case "MEXICO":
		case "ARGENTINA":
		case "ESPANHA":
			System.out.println("Buenos dias");
			break;
		default:
			System.out.println("Good Morning");
			break;
			
		}
	}
}
