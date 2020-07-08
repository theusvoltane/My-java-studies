package capitulo04;

public class EstruturaCondicional01 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Aqui estou começando" );
		
		if(a==10) {
			System.out.println("Entrou na condição");
		}else {
			System.out.println("Entrou no else");
		}
		
		System.out.println("Agora finalizei");
		
		//CONDICIONAL ENCADEADA
		int opcao = 3;
		
		if(opcao == 1) {
			System.out.println("Abrir cadastro de usuários");
		}else if(opcao == 2 ) {
			System.out.println("Abrir consulta de usuários");
		}else if(opcao == 3) {
			System.out.println("Abrir relatório de usuários");
		}else {
			System.out.println("Opção é inválida");
		}
		
	}
}
