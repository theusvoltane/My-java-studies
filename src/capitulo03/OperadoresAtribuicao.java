package capitulo03;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
int a = 1;
		
		//OPERADORES DE ATRIBUICAO REDUZIDO
		a *= 4;
		System.out.println(a);
		
		a /= 2;
		System.out.println(a);
		
		a += 2;
		System.out.println(a);
		
		a -= 2;
		System.out.println(a);
		
		a %= 2;
		System.out.println(a);		
		
		System.out.println("\n---------------------\n");
		//OPERADOR INCREMENTAL E DECREMENTAL
		int b = 0;
		System.out.println(b);
		
		//POS INCREMENTAL - INCREMENTA NA PRIXIMA LINHA DE EXECUÇAO
		b++; 
		System.out.println(b);
		
		b++;
		System.out.println(b++);
		System.out.println(b);
		System.out.println(++b);//PRE INCREMENTAL - INCREMENTA NA MESMA LINHA DE EXECUCAO
		
		b--;
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);//PRE INCREMENTAL - INCREMENTA NA MESMA LINHA DE EXECUCAO
		System.out.println(b);
		System.out.println(--b);
	}
}
