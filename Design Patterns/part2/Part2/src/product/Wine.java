package product;

public class Wine extends Beverages{
	public double price = 7.45;
	public int calories = 608;
	String size = "0.75L";
	
	public String getType() {
		return "Wine";
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
