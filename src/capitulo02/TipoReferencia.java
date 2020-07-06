package capitulo02;

import javax.swing.JOptionPane;

public class TipoReferencia {
	public static void main(String[] args) {
		String nomeCompleto;
		
		nomeCompleto = "Matheus Voltane";
		
		JOptionPane.showMessageDialog(null, nomeCompleto + " - " + nomeCompleto.length() );
		
		System.out.println(DiaDaSemana.SEXTA);
		
	}
}
