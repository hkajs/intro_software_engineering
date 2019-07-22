package product;

public class Ham extends Toppings{
	public int calories = 35;
	public double price = 0.95;
	
	public String getType() {
		return "Ham";
	}
	public int getCalories() {
		return calories;
	}
	public double getPrice() {
		return price;
	}
}
