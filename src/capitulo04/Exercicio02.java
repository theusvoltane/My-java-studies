package capitulo04;

public class Exercicio02 {
	public static void main(String[] args) {
		float salario = 3000f;
		
		if((salario > 0) && (salario < 2000) ) {
			System.out.println("Seu salario de:"+salario+" tera um acrecimo de 10%: "+salario*1.1);
		}else if((salario > 1999) && (salario < 3000) ) {
			System.out.println("Seu salario de:"+salario+" tera um acrecimo de 7%: "+salario*1.07);
		}else if((salario > 2999) && (salario < 4000) ) {
			System.out.println("Seu salario de:"+salario+" tera um acrecimo de 5%: "+salario*1.05);
		}else {
			System.out.println("Não ha aumento disponivel");	
		}
		
	}
}
