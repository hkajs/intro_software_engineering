package product;

public class Onions extends ToppingDecorator {
	public int calories = 22;
	public double price = 0.65;
	public Onions(Pizza pizza) {
		super(pizza);

	}

	public String getType() {
		return "Onions";
	}
	public int getCalories() {
		return super.getpizzacalories() + this.calories;
	}
	public double getPrice() {
		return super.getpizzacost() + this.price;
	}
}
