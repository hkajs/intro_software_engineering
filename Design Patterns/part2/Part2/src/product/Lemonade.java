package product;

public class Lemonade extends Beverages{
	public double price = 1.25;
	public int calories = 128;
	public String size = "0.33L";
	
	public String getType() {
		return "Lemonade";
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
