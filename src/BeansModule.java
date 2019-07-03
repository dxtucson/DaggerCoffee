
import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class BeansModule {

	private static String[] beanOptions = {"Starbucks", "Peets", "Maxwell"};
	
	@Provides
	String provideBeans() {
		int index = new Random().nextInt(3);
		return beanOptions[index];
	}
}
