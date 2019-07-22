package product;

public class Cheese extends Toppings{
	public int calories = 92;
	public double price = 0.65;
	
	public String getType() {
		return "Cheese";
	}
	public int getCalories() {
		return calories;
	}
	public double getPrice() {
		return price;
	}
	
}
