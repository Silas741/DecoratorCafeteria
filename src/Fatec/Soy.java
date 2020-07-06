package Fatec;

public class Soy extends CorDaLinhaDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.50 + getBeverage().cost();
	}

}
