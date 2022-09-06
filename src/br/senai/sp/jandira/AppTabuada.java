package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
//		FrameTabuada tela = new FrameTabuada();
//		tela.titulo = "Tabuada 1.0";
//		tela.altura = 700;
//		tela.largura = 500;
		
		
		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 8;
		tabuada.minimoMultiplicador = 9;
		tabuada.maximoMultiplicador = 18;
		
		
		int i = 0;
		String resultado[] = tabuada.getTabuada();
		
		while (i < resultado.length) {
		
			System.out.println(resultado[i]);
			i++;
			
		}
		
	}

}
