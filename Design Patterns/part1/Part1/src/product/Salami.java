package product;

public class Salami extends Toppings{
	public int calories = 86;
	public double price = 0.95;
	
	public String getType() {
		return "Salami";
	}
	public int getCalories() {
		return calories;
	}
	public double getPrice() {
		return price;
	}
}
