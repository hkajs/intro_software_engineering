package product;

public class Cheese extends ToppingDecorator{
	public int calories = 92;
	public double price = 0.65;
	public Cheese(Pizza pizza) {
		super(pizza);
	}
	
	public String getType() {
		return "Cheese";
	}
	public int getCalories() {
		return super.getpizzacalories() + this.calories;
	}
	public double getPrice() {
		return super.getpizzacost() + this.price;
	}

	
}
