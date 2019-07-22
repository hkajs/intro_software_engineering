package product;

public class Client {
	static Pizza pizza = new Pizza();
	static Beverages beverage;
	static FranchiseItems item;
	static double overallprice = 0;
	static int overallcalories=0;
	
	public static void orderCustomPizza() {
		Cheese cheese = new Cheese();
		pizza.addtopping(cheese);
		pizza.getpizzatype();
		overallprice += pizza.getPrice();
		overallcalories += pizza.getCalories();
		System.out.println("You have ordered a custom pizza, please add toppings");
	}
	
	public static void orderMargheritaPizza() {
		Cheese cheese = new Cheese();
		pizza.addtopping(cheese);
		pizza.getpizzatype();
		overallprice += pizza.getPrice();
		overallcalories += pizza.getCalories();
		System.out.println("You have ordered a pizza Margherita");

	}
	
	public static void orderHawaiianPizza() {
		Cheese cheese = new Cheese();
		Ham ham = new Ham();
		Pineapple pineapple = new Pineapple();
		pizza.addtopping(cheese);
		pizza.addtopping(ham);
		pizza.addtopping(pineapple);
		pizza.getpizzatype();
		overallprice += pizza.getPrice();
		overallcalories += pizza.getCalories();
		System.out.println("You have ordered a Hawaiian Pizza");


	}
	
	public static void orderSalamiPizza() {
		Cheese cheese = new Cheese();
		Salami salami = new Salami();
		pizza.addtopping(cheese);
		pizza.addtopping(salami);
		pizza.getpizzatype();
		overallprice += pizza.getPrice();
		overallcalories += pizza.getCalories();
		System.out.println("You have ordered a Salami Pizza");
	}
	
	
	
	public static void addTopping(Toppings x) {
		pizza.addtopping(x);
		overallprice += x.getPrice();
		overallcalories += x.getCalories();
		System.out.println("You have added " + x.getType() + " to your pizza");

	}
	
	
	public static void orderWater() {
		beverage = new Water();
		overallprice += beverage.getPrice();
		overallcalories += beverage.getCalories();
		System.out.println("You have ordered a Water");

	}
	
	public static void orderLemonade() {
		beverage = new Lemonade();
		overallprice += beverage.getPrice();
		overallcalories += beverage.getCalories();
		System.out.println("You have ordered a Lemonade");

	}

	public static void orderWine() {
		beverage = new Wine(); 	
		overallprice += beverage.getPrice();
		overallcalories += beverage.getCalories();
		System.out.println("You have ordered a Wine");

	}
	
	public static void orderPizzaStarMug() {
		item = new PizzaStarMug();
		overallprice += item.getPrice();
		System.out.println("You have ordered a PizzaStar Mug");
	}
	
	public static void orderPizzaStarShirt() {
		item = new PizzaStarShirt();
		overallprice += item.getPrice();
		System.out.println("You have ordered a PizzaStar Shirt");
	}
	
	public static void getOverallPrice() {
		System.out.println("Overall price is $" + ((double)((int)(overallprice *100.0)))/100. + ".");
	}
	
	public static void getOverallCalories() {
		System.out.println("Overall calories is " + overallcalories + ".");
	}
	
	public static void familySize() {
		pizza.familysize();
		System.out.println("You have family sized your pizza");
	}
	
	public static void checkSize() {
		pizza.getSize();
	}
	
	public static void getToppings() {
		pizza.gettoppings();
	}
	
	public static void newPizzaOrder() {
		System.out.println();
		overallprice = 0;
		overallcalories = 0;
		pizza = new Pizza();
		System.out.println("Next Pizza being ordered");
		System.out.println();
		}
	
	public static void getBeverageFacts(Beverages b) {
		System.out.println(b.getType() + " is " + b.getSize() + ", has " + b.getCalories() + " calories, and costs " + b.getPrice());
	}
	
	public static void getPizzaFacts(Pizza p) {
		System.out.println("This pizza has " + p.getCalories() + " calories, and costs " + p.getPrice());

	}
	
	public static void getToppingsFacts(Toppings t) {
		System.out.println(t.getType() + " has " + t.getCalories() + " calories, and costs " + t.getPrice());

	}
	
	public static void getMerchandiseFacts(FranchiseItems f) {
		System.out.println("This merchandise costs " + f.getPrice());
	}

	public static void main(String[] args) {
		orderCustomPizza();
		addTopping(new Cheese());
		addTopping(new Onions());
		orderLemonade();
		getOverallPrice();
		getOverallCalories();
		
		newPizzaOrder();
		
		orderHawaiianPizza();
		getToppingsFacts(new Pineapple());
		addTopping(new Pineapple());
		familySize();
		getToppings();
		getBeverageFacts(new Lemonade());
		orderLemonade();
		getMerchandiseFacts(new PizzaStarShirt());
		orderPizzaStarShirt();
		checkSize();
		getOverallPrice();
		getOverallCalories();
	}

}
