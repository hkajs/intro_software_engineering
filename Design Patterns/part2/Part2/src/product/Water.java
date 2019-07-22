package product;

public class Water extends Beverages{
	public double price = 1.25;
	public int calories = 0;
	String size = "0.5L";
	
	public String getType() {
		return "Water";
	}
	public int getCalories() {
		return calories;
	}
	public double getPrice() {
		return price;
	}
	public String getSize() {
		return size;
	}
	
}
