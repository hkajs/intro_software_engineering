package product;

public abstract class Beverages extends Consumables{
	public String size = "";

	public abstract String getType();
	public abstract int getCalories();
	public abstract double getPrice();
	public abstract String getSize();
}
