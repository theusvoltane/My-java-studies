package capitulo03;

public class OperadoresTernario {
	public static void main(String[] args) {
	int value = 7;
	
	if(value > 10) {
		System.out.println("Limite foi ultrapassado");
	}else {
		System.out.println("Ainda estamos dentro do limite");
	}
	
	System.out.println((value > 10) ? "limite ultrapassado": "Estamos dentro do limite");
	
	}
}
