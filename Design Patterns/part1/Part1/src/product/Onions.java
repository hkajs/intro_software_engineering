package product;

public class Onions extends Toppings {
	public int calories = 22;
	public double price = 0.65;
	
	public String getType() {
		return "Onions";
	}
	public int getCalories() {
		return calories;
	}
	public double getPrice() {
		return price;
	}
}
