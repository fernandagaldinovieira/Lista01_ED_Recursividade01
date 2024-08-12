package view;

import javax.swing.JOptionPane;

import controller.SomaNaturaisController;

public class Principal {

	public static void main(String[] args) {
		int i;
		i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		SomaNaturaisController somaNaturaisController = new SomaNaturaisController();	
		int soma = somaNaturaisController.somaNaturais(i);	
		System.out.println("O somatório dos " + i + " primeiros números naturais é de: " + soma);
	}
}
