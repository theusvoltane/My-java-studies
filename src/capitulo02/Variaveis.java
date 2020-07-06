package capitulo02;

public class Variaveis {
	public static void main(String[] args) {
		int idade = 0;
		System.out.println(idade);
		idade = 26;
		System.out.println(idade);
		
		final int anoNascimento;
		anoNascimento = 1993;
		System.out.println(anoNascimento);
		
		//ESCOPO PARA TESTES
		{
			System.out.println("Dentro Do Escopo Principal");
			System.out.println(idade);
			System.out.println(anoNascimento);
			int id = 10;
			System.out.println(id);
		}
	}
}
