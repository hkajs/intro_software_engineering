package product;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Consumables{
	private String PizzaName = "Custom Pizza";
	private boolean familysize;
	private ArrayList<Toppings> Toppings = new ArrayList<Toppings>(); 
	private double price;
	private int calories;
	

	public void addtopping(Toppings x) {
		this.Toppings.add(x);
	}
	
	public void getpizzatype() {
		if (this.Toppings.size() == 3) {
			if (this.Toppings.get(0) instanceof Cheese && this.Toppings.get(1) instanceof Ham && this.Toppings.get(2) instanceof Pineapple) {
				this.PizzaName = "Hawaiian Pizza";
				this.price = 6.45;
				this.calories = 1024;
			}
		} else if (this.Toppings.size() == 2){
			if (this.Toppings.get(0) instanceof Cheese && this.Toppings.get(1) instanceof Salami) {
				this.PizzaName = "Salami Pizza";
				this.price = 5.95;
				this.calories = 1160;

			}
		} else if (this.Toppings.size() == 1 && this.Toppings.get(0) instanceof Cheese) {
			this.PizzaName = "Pizza Margherita";
			this.price = 4.95;
			this.calories = 1104;
		} else {
			this.PizzaName = "Custom Pizza";
			this.price = 4.95;
			this.calories = 1104;
			for (int x = 1; x < this.Toppings.size(); x++) {
				this.price += this.Toppings.get(x).getPrice();
				this.calories += this.Toppings.get(x).getCalories();
			}
		}
	}
	
	public void familysize() {
		this.familysize = true;
	}
	

	public void gettoppings() {
		System.out.println("The toppings are: ");
		for (int x = 0; x < this.Toppings.size(); x++) {
			System.out.println(this.Toppings.get(x).getType() + ", " + this.Toppings.get(x).getCalories() + " calories, " + this.Toppings.get(x).getPrice() + " dollars.");
		}
	}
	
	public int getCalories() {
		int overallcalories = this.calories;
		if (this.familysize == true) {
			overallcalories *= 1.95;
		}
		this.calories = overallcalories;
		return this.calories;
	}
	
	public void getSize() {
		if (this.familysize == true) {
			System.out.println("Pizza size is Family Size.");
		}else{
			System.out.println("Pizza size is Normal Size.");
		}
	}
	
	public double getPrice() {
		if (this.familysize == true) {
			this.price += 4.15;
		}
		this.price = ((double)((int)(this.price *100.0)))/100.0;
		return this.price;
		
	}
	
	
	
}
