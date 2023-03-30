package ammoTypes;

import java.util.Random;

interface Emission{
	int run(int a,int b);
}
interface Arming{
	boolean run(boolean alwaysUnlocked);
}
interface Cal{
	Calibers run();
}


public class RandomSupplier {
	static Random random = new Random();
	public static int provideRandomCO2EmissionGenerator(int a, int b){
		Emission emissionLambda = ((x, y) -> x +random.nextInt(y - x +1));
		return emissionLambda.run(a,b);
	}
	public static boolean provideRandomSafeGenerator(boolean alwaysUnlocked){
		Arming lambda = ((x) -> {
			if (x){
				return false;
			}
			return !(random.nextDouble() < 0.05);
		});
		return lambda.run(alwaysUnlocked);
	}
	public static Calibers provideRandomCaliberGenerator(){
		Cal emissionLambda = (() -> {
			int i = random.nextInt(Calibers.values().length);
			return switch (i) {
				case 1 -> Calibers.FOURPOINTZERO;
				case 2 -> Calibers.FIVEPOINTFIFTYSIX;
				case 3 -> Calibers.SEVENPOINTSIXTYTWO;
				case 4 -> Calibers.NINEPOINTZERO;
				default -> Calibers.TWELVEPOINTSEVEN;
			};
		});
		return emissionLambda.run();
	}
}
