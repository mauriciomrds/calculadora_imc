package curso.java.adcio.arquivos;

import javax.swing.JOptionPane;

public class CalculadoraImc {
	
	public static void main(String[]args) {
		
		
	String altura =	JOptionPane.showInputDialog(" Digite sua altura: ");
	String peso = JOptionPane.showInputDialog(" Digite o seu peso: ");
	
	double alturaPessoa = Double.parseDouble(altura);
	double pesoPessoa = Double.parseDouble(peso);
	
		double resultado =(int) pesoPessoa/(alturaPessoa * alturaPessoa);
		
		if(resultado <= 18.4) {
			JOptionPane.showInternalMessageDialog(null, " O seu IMC est� muito abaixo do peso est� magro! " +  resultado);
		}
		if(resultado >18.5 && resultado <25){
			JOptionPane.showInternalMessageDialog(null, " O seu IMC est� legal! " +  resultado );
		}
		if(resultado >25){
			
			JOptionPane.showInternalMessageDialog(null, " O seu IMC muito alto est� obeso! " +  resultado);
		}
		
	} 
}