
public class TestCoffeeBrew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeComponent cc = DaggerCoffeeComponent.builder().build();
		CupOfCoffee coffee = cc.makeCoffee();
		coffee.enjoyCoffee();
	}
}
