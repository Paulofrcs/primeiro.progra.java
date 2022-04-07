package cursojava.executavel;

import javax.swing.JOptionPane;

import org.graalvm.compiler.lir.StandardOp.JumpOp;

public class PrimeiraClasseJava {

	/* Main é um método auto executável de Java */
	public static void main(String[] args) {

		
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
		
		
		
		double nNota1 = Double.parseDouble(nota1);
		double nNota2 = Double.parseDouble(nota2);
		double nNota3 = Double.parseDouble(nota3);
		double nNota4 = Double.parseDouble(nota4);
		
		double media = (nNota1 + nNota2 + nNota3 + nNota4) / 4;
		
		/*Média para aprovação é 70*/
		
		if (media >= 50) {
			
			if (media >= 70) {
				JOptionPane.showConfirmDialog(null, "O aluno está aprovado com média de :" + media);
			}else {
				JOptionPane.showConfirmDialog(null, "O aluno está em recueração com média de :" + media);
			}
		}else {
			JOptionPane.showConfirmDialog(null, "Aluno está reprovado com média de : " + media);
		}
		
	}	
					
		
}

