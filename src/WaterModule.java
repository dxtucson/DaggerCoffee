
import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class WaterModule {
	@Provides
	int provideWater() {
		Random r = new Random();
		return r.nextInt(10)+1;
	}
}
