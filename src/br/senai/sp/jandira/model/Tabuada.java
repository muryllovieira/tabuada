package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicando;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	
	public String[] getTabuada() {
		
		int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String[] tabuada = new String[tamanho];
		
		int i = 0;
		
		while(i < tamanho) {
			
			int resultadoConta = multiplicando * minimoMultiplicador;
			
			String resultado = multiplicando + " X " + minimoMultiplicador + " = " + resultadoConta;
			
			tabuada[i] = resultado;
			
			i++;
			minimoMultiplicador++;
			
		}
		
		return tabuada;
	}
	

	
}
