package controller;

import edu.fatec.Pilha;

public class PalindromoController {
	public String invertePalavra (String p) throws Exception {
		Pilha pilha = new Pilha();
		
		for (int i = 0; i < p.length(); i++) {
			pilha.push(p.substring(i, i+1));
		}
		
		return desempilha(pilha);
	}
	
	public String desempilha (Pilha p) throws Exception {
		String palavra = "";
		while (!p.isEmpty()) {
			palavra += p.pop();
		}
		return palavra;
	}
	
	public boolean comparaPalavras(String p, String pi) throws Exception {
		if (p.equals(invertePalavra(pi))) {
			return true;
		} else {
			return false;
		}
	}
}
