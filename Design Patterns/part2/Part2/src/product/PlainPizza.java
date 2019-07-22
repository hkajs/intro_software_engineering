package product;

import java.util.ArrayList;

public class PlainPizza extends Consumables implements Pizza{
	String pizzatype = "Plain Pizza";
	double price = 4.95;
	int calories = 1104;
	boolean size = false;
	ArrayList<ToppingDecorator> toppings = new ArrayList<ToppingDecorator>();
	
	@Override
	public void familysize() {
		size = true;
	}
	
	public void getpizzasize() {
		if (size == true) {
			System.out.println("This pizza is family sized");
		}else {
			System.out.println("This pizza is normal sized");

		}
	}
	@Override
	public int getpizzacalories() {
		return calories;
	}
	@Override
	public double getpizzacost() {
		return price;
	}
	
	

	

}
