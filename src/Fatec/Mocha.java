package Fatec;

public class Mocha extends CorDaLinhaDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.60 +getBeverage().cost();
	}

}
