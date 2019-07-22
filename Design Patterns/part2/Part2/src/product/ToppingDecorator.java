package product;

import java.util.ArrayList;

public abstract class ToppingDecorator implements Pizza{
	Pizza pizza;
	boolean size;
	int calories;
	int price;
	
	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public ToppingDecorator() {
		
	}
	
	public void familysize() {
		return;
	}
	
	public int getpizzacalories() {
		return pizza.getpizzacalories();
	}

	public void getpizzasize() {
		return;
	}

	public double getpizzacost() {
		return pizza.getpizzacost();
	}

	public abstract String getType();

	public abstract int getCalories();

	public abstract double getPrice();
	
	public void addToppings(ToppingDecorator x) {
		
	}

}
