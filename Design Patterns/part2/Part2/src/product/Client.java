package product;

final class Client {
	static Pizza pizza = new PlainPizza();
	static Beverages beverage;
	static FranchiseItems item;
	static double overallprice = 0;
	static int overallcalories = 0;
	static double pizzaprice = 0;
	static int pizzacalories = 0;
	
	public static void orderCustomPizza() {
		pizza = new Cheese(new PlainPizza());
		pizzaprice += pizza.getpizzacost();
		pizzacalories += pizza.getpizzacalories();
		System.out.println("You have ordered a custom pizza, please add toppings");
	}
	
	public static void orderMargheritaPizza() {
		pizza = new Cheese(new PlainPizza());
		pizzaprice += pizza.getpizzacost();
		pizzacalories += pizza.getpizzacalories();
		System.out.println("You have ordered a pizza Margherita");
	}
	
	public static void orderHawaiianPizza() {
		pizza = new Cheese(new Ham(new Pineapple(new PlainPizza())));
		pizzaprice += 6.45;
		pizzacalories += 1024;
		System.out.println("You have ordered a Hawaiian Pizza");
	}
	
	public static void orderSalamiPizza() {
		pizza = new Cheese(new Salami(new PlainPizza()));
		pizzaprice += 5.95;
		pizzacalories += 1160;
		System.out.println("You have ordered a Salami Pizza");
	}
	
	public static void addCheese() {
		pizza = new Cheese(pizza);
		pizzaprice += 0.65;
		pizzacalories += 92;
		System.out.println("You have added Cheese to your pizza");
	}
	public static void addHam() {
		pizza = new Ham(pizza);
		pizzaprice += 0.95;
		pizzacalories += 35;

		System.out.println("You have added Ham to your pizza");
	}
	
	public static void addOnions() {
		pizza = new Onions(pizza);
		pizzaprice += 0.65;
		pizzacalories += 22;

		System.out.println("You have added Onions to your pizza");
	}
	
	public static void addPineapple() {
		pizza = new Pineapple(pizza);
		pizzaprice += 0.75;
		pizzacalories += 24;

		System.out.println("You have added Pineapple to your pizza");
	}
	
	public static void addSalami() {
		pizza = new Salami(pizza);
		pizzaprice += 0.95;
		pizzacalories += 86;

		System.out.println("You have added Cheese to your pizza");
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
		System.out.println("Overall price is $" + ((double)((int)((overallprice + pizzaprice ) *100.0)))/100. + ".");
	}
	
	public static void getOverallCalories() {
		System.out.println("Overall calories is " + (overallcalories + pizzacalories) + ".");
	}
	
	public static void familySize() {
		pizza.familysize();
		pizzaprice += 4.15;
		pizzacalories *= 1.95;
		System.out.println("You have family sized your pizza");
	}
	
	public static void checkSize() {
		pizza.getpizzasize();
	}
	
	public static void newPizzaOrder() {
		System.out.println();
		overallprice = 0;
		overallcalories = 0;
		pizza = new PlainPizza();
		System.out.println("Next Pizza being ordered");
		System.out.println();
	}
	
	public static void getBeverageFacts(Beverages b) {
		System.out.println(b.getType() + " is " + b.getSize() + ", has " + b.getCalories() + " calories, and costs " + b.getPrice());
	}
	
	public static void getPizzaFacts(Pizza p) {
		System.out.println("This pizza has " + p.getpizzacalories() + " calories, and costs " + p.getpizzacost());

	}
	
	public static void getToppingsFacts(ToppingDecorator t) {
		System.out.println(t.getType() + " has " + t.getCalories() + " calories, and costs " + t.getPrice());

	}
	
	public static void getMerchandiseFacts(FranchiseItems f) {
		System.out.println("This merchandise costs " + f.getPrice());
	}

	public static void main(String[] args) {
		orderCustomPizza();
		addCheese();
		addOnions();
		orderLemonade();
		getOverallPrice();
		getOverallCalories();
		
		newPizzaOrder();
		
		orderHawaiianPizza();
		getToppingsFacts(new Pineapple(pizza));
		addPineapple();
		familySize();
		getBeverageFacts(new Lemonade());
		orderLemonade();
		getMerchandiseFacts(new PizzaStarShirt());
		orderPizzaStarShirt();
		checkSize();
		getOverallPrice();
		getOverallCalories();
	}

}
