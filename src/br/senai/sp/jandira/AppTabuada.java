package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 600;
		tela.largura = 600;
		tela.fonteDosLabels = new Font("Inter", Font.BOLD, 17);
		tela.corDoBotao = new Color (142, 245, 139);
		tela.corDoSegundoBotao = new Color (255, 72, 72);
		tela.fonteDaLista = new Font("Arial", Font.BOLD, 20);
		tela.corDoFundo = new Color (138, 218, 230);
		tela.criarTela();
	}
}
