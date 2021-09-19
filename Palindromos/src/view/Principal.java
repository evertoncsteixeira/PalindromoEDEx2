package view;
import javax.swing.JOptionPane;

import controller.PalindromoController;
import edu.fatec.Pilha;
public class Principal {

	public static void main(String[] args) {
		String p2 = "";
		PalindromoController pcontr = new PalindromoController();
		String p = JOptionPane.showInputDialog("Digite uma palavra: ");
		System.out.println("A palavra invertida é : ");
		try {
			System.out.println(pcontr.invertePalavra(p));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int input = 0;
		Pilha pi = new Pilha();
		while (input != 2) {
			input = Integer.parseInt(JOptionPane.showInputDialog("Deseja digitar o Palindromo? \n1 - Para continuar \n2 - Para terminar"));
			if (input != 2) {
				pi.push(JOptionPane.showInputDialog("A letra : "));
			}
		}

		
		try {
			p2 = pcontr.desempilha(pi);
			p2 = pcontr.invertePalavra(p2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if (pcontr.comparaPalavras(p, p2)){
				System.out.println("É Palindromo!");
			} else {
				System.out.println("Não é Palindromo!");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
