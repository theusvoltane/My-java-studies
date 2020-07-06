package capitulo02;

public class Casting {
	public static void main(String[] args) {
		byte num01 = 1;
		int num02 = 188;
		float num03 = 13550.88f;
		double num04 = 0;
		System.out.println(num03 + " + " + num04);
		
		int temp01;
		
		temp01=num01;
		System.out.println(temp01);
		
		byte temp02;
		
		temp02 = (byte) num02;
		System.out.println(temp02);
	}
}
