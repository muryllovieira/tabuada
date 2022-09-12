package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	public Font fonteDosLabels;
	public Color corDoBotao;
	public Color corDoSegundoBotao;
	public Font fonteDaLista;
	public Color corDoFundo;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		Container painel = tela.getContentPane();
		painel.setBackground(corDoFundo);

		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(120, 10, 600, 30);
		labelTabuada.setFont(new Font("Inter", Font.BOLD, 25));
		labelTabuada.setForeground(Color.red);

		JLabel labelTexto = new JLabel();
		labelTexto.setText(
				"<html>Com a tabuada 1.0 os seus problemas acabaram.<br> Calcule a tabuada que desejar em segundos!</html>"
						+ "");
		labelTexto.setBounds(120, 45, 600, 30);
		labelTexto.setFont(new Font("Calibri", Font.BOLD, 12));

		ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/img/questionario.png");
		JLabel icon = new JLabel(icone);
		icon.setBounds(10, 8, 100, 100);

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(121, 100, 600, 30);
		labelMultiplicando.setFont(fonteDosLabels);
		labelMultiplicando.setForeground(Color.BLACK);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(250, 100, 200, 30);
		textFieldMultiplicando.setFont(new Font("Arial", Font.BOLD, 25));
		textFieldMultiplicando.setForeground(Color.BLUE);
		textFieldMultiplicando.setHorizontalAlignment(JTextField.RIGHT);

		JLabel labelminimoMultiplicador = new JLabel();
		labelminimoMultiplicador.setText("Mínimo Multiplicador:");
		labelminimoMultiplicador.setBounds(70, 150, 600, 30);
		labelminimoMultiplicador.setFont(fonteDosLabels);
		labelminimoMultiplicador.setForeground(Color.BLACK);

		JTextField textFieldminimoMultiplicador = new JTextField();
		textFieldminimoMultiplicador.setBounds(250, 150, 200, 30);
		textFieldminimoMultiplicador.setFont(new Font("Arial", Font.BOLD, 25));
		textFieldminimoMultiplicador.setForeground(Color.BLUE);
		textFieldminimoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);

		JLabel labelmaximoMultiplicador = new JLabel();
		labelmaximoMultiplicador.setText("Máximo Multiplicador:");
		labelmaximoMultiplicador.setBounds(70, 200, 600, 30);
		labelmaximoMultiplicador.setFont(fonteDosLabels);
		labelmaximoMultiplicador.setForeground(Color.BLACK);

		JTextField textFieldmaximoMultiplicador = new JTextField();
		textFieldmaximoMultiplicador.setBounds(250, 200, 200, 30);
		textFieldmaximoMultiplicador.setFont(new Font("Arial", Font.BOLD, 25));
		textFieldmaximoMultiplicador.setForeground(Color.BLUE);
		textFieldmaximoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(70, 250, 200, 30);
		buttonCalcular.setBackground(corDoBotao);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(300, 250, 150, 30);
		buttonLimpar.setBackground(corDoSegundoBotao);

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(70, 290, 600, 30);
		labelResultado.setFont(fonteDosLabels);
		labelResultado.setForeground(Color.BLACK);

		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(70, 320, 470, 220);
		JList<String> listLista = new JList<>();
		listLista.setBackground(new Color(255, 255, 167));
		listLista.setFont(fonteDaLista);
		listLista.setBorder(new LineBorder(Color.BLUE));


		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonLimpar)
					;

				textFieldMultiplicando.setText(null);
				textFieldminimoMultiplicador.setText(null);
				textFieldmaximoMultiplicador.setText(null);

				DefaultListModel<String> lista = new DefaultListModel<>();
				listLista.setModel(lista);

			}
		});

		painel.add(labelTabuada);
		painel.add(labelTexto);
		painel.add(icon);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelminimoMultiplicador);
		painel.add(textFieldminimoMultiplicador);
		painel.add(labelmaximoMultiplicador);
		painel.add(textFieldmaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(listLista);

		tela.setVisible(true);

		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O multiplicando é obrigatório!");
					textFieldMultiplicando.requestFocus();
				} else if (textFieldminimoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O mínimo multiplicador é obrigatório!");
					textFieldminimoMultiplicador.requestFocus();
				} else if (textFieldmaximoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O máximo multiplicador é obrigatório!");
					textFieldmaximoMultiplicador.requestFocus();
				} else if(Integer.parseInt(textFieldMultiplicando.getText()) > 1000 || Integer.parseInt(textFieldminimoMultiplicador.getText()) > 1000 || Integer.parseInt(textFieldmaximoMultiplicador.getText()) > 1000) {
					JOptionPane.showMessageDialog(null, "Os valores devem ser menor ou igual a 1000!", "ERRO", JOptionPane.OK_OPTION);
				} else {
					
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textFieldminimoMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textFieldmaximoMultiplicador.getText());
					if(tabuada.maximoMultiplicador < tabuada.minimoMultiplicador) {
						JOptionPane.showMessageDialog(null, "Multiplicador mínimo maior que o máximo", "ERRO", JOptionPane.OK_OPTION);
						textFieldMultiplicando.setText("");
						textFieldminimoMultiplicador.setText("");
						textFieldmaximoMultiplicador.setText("");
					} else {
						
						listLista.setListData(tabuada.getTabuada());
						scroll.getViewport().add(listLista);
						
					}
				}
				
				System.out.println("Saiu!!");


			}
		});

	}

}
