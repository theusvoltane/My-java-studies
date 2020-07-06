package capitulo03;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		//OPERADORES RELACIONAIS _ TERMO1 "OPERADOR DE COMPARACAO" TERMO
		int value1 = 10, value2 = 7 , value3 = 5;
		
		//MAIOR QUE
		System.out.println(value1 > 7);
		System.out.println(value2 > value3);
		
		//MENOR QUE 
		System.out.println(value2 < value3 + value1);
		
		//MAIOR OU IGUAL A
		System.out.println((value3+value2-2)>= value1);
		
		//MENOR OU IGUAL A
		System.out.println((value3+value2-2)<= value1);
		
		//DIFERENTE DE
		System.out.println((value3+value2-5) != value1);
		
		//IGUAL A
		System.out.println((value3+value2-2) == value1 );
	}
	
}
