package Fatec;

public class Milk extends CorDaLinhaDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.0 + getBeverage().cost();
	}

}
