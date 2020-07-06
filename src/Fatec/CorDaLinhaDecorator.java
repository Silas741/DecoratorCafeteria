package Fatec;

public abstract class CorDaLinhaDecorator extends Beverage {

	private Beverage beverage;

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	public Beverage getBeverage() {
		return beverage;
	}
	public CorDaLinhaDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
}
