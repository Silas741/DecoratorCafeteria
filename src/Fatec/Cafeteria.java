package Fatec;

import java.text.NumberFormat;

import javax.swing.JOptionPane;



public class Cafeteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opBebidas;
		int opCondimentos = 0;
		String MenuBebidas = "1 - Darkhost \n2 - HouseBlend \n3 - Espresso \n4 - Decaf";
		opBebidas = Integer.parseInt(JOptionPane.showInputDialog(MenuBebidas));

		String MenuCondimento = "1 - Milk \n2 - Mocha n\3 - Soy \n4 - Whip \n0 - Sair ";
		Beverage bebida = null;
		switch (opBebidas) {
		case 1:

			bebida = new DarkHost();
			break;

		case 2:
			bebida = new HouseBlend();
			break;

		case 3:
			bebida = new Espresso();
			break;

		case 4:
			bebida = new Decaf();
			break;

		}
		do {
			opCondimentos = Integer.parseInt(JOptionPane.showInputDialog(MenuCondimento));
			switch (opCondimentos) {
			case 1:
				bebida = new Milk(bebida);
				break;
			case 2:
				bebida = new Mocha(bebida);
				break;
			case 3:
				bebida = new Soy(bebida);
				break;
			case 4:
				bebida = new Whip(bebida);
				break;
			case 0:
				JOptionPane.showInputDialog(null,"Até logo");
				break;
				default:
					JOptionPane.showInputDialog(null,"Opção invalida");
				break;
			}
		} while (opCondimentos != 0);
		JOptionPane.showInputDialog(null,"Valor total do pedido:"+ NumberFormat.getCurrencyInstance().format(bebida.cost()));
	}
}
