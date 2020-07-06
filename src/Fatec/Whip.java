package Fatec;

public class Whip extends CorDaLinhaDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.90 + getBeverage().cost();
	}

}
