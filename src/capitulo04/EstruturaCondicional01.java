package capitulo04;

public class EstruturaCondicional01 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Aqui estou come�ando" );
		
		if(a==10) {
			System.out.println("Entrou na condi��o");
		}else {
			System.out.println("Entrou no else");
		}
		
		System.out.println("Agora finalizei");
		
		//CONDICIONAL ENCADEADA
		int opcao = 3;
		
		if(opcao == 1) {
			System.out.println("Abrir cadastro de usu�rios");
		}else if(opcao == 2 ) {
			System.out.println("Abrir consulta de usu�rios");
		}else if(opcao == 3) {
			System.out.println("Abrir relat�rio de usu�rios");
		}else {
			System.out.println("Op��o � inv�lida");
		}
		
	}
}
