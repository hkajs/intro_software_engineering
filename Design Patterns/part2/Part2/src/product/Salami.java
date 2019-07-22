package product;

public class Salami extends ToppingDecorator{
	public int calories = 86;
	public double price = 0.95;
	
	public Salami(Pizza pizza) {
		super(pizza);
	}
	
	public String getType() {
		return "Salami";
	}
	public int getCalories() {
		return super.getpizzacalories() + this.calories;
	}
	public double getPrice() {
		return super.getpizzacost() + this.price;
	}
}
