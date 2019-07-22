package product;

public class Ham extends ToppingDecorator{
	public int calories = 35;
	public double price = 0.95;
	public Ham(Pizza pizza) {
		super(pizza);
		}

	public String getType() {
		return "Ham";
	}
	public int getCalories() {
		return super.getpizzacalories() + this.calories;
	}
	public double getPrice() {
		return super.getpizzacost() + this.price;
	}
}
