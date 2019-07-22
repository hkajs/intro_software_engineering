package product;

public class Pineapple extends Toppings{
	public int calories = 24;
	public double price = 0.75;
	
	public String getType() {
		return "Pineapples";
	}
	public int getCalories() {
		return calories;
	}
	public double getPrice() {
		return price;
	}
}
