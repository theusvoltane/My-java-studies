package capitulo03;

public class OperadoresLogicos {
	public static void main(String[] args) {
		//OPERADORES LOGICOS (!, &&, ||, ^)
				int value1 = 10, value2 = 7, value3 = 5;
				
				System.out.println((value1 >= value2) && ((value3 + 2) == value2));
				
				System.out.println((value1 <= value2) || ((value3 + 2) == value2));
				
				System.out.println((value1 == value2) ^ ((value3 + 2)!= value2));

				System.out.println(!((value1 == value2) ^ ((value3 + 2)!= value2)));
			}

}
