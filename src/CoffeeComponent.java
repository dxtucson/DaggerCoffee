
import dagger.Component;

@Component(modules = {WaterModule.class, BeansModule.class})
public interface CoffeeComponent {

	CupOfCoffee makeCoffee();
}
