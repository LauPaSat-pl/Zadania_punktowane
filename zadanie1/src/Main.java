import java.util.Random;

public class Main {
	public static void main(String[] args) {
		for (int i=0;i<100;i++) {
			double height = 10.5 + 41 * new Random().nextDouble();
			System.out.println(height);
		}
	}
}
