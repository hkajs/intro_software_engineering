package product;

public class Pineapple extends ToppingDecorator{
	public int calories = 24;
	public double price = 0.75;
	public Pineapple(Pizza pizza) {
		super(pizza);

	}

	public String getType() {
		return "Pineapples";
	}
	public int getCalories() {
		return super.getpizzacalories() + this.calories;
	}
	public double getPrice() {
		return super.getpizzacost() + this.price;
	}
}
