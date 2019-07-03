
import javax.inject.Inject;

public class CupOfCoffee {

	String coffee;
	int water;

	@Inject
	public CupOfCoffee(String coffee, int water) {
		this.coffee = coffee;
		this.water = water;
	}

	public void enjoyCoffee() {
		System.out.println("Consumed " + water + " ounces of " + coffee + " coffee");
	}
}
