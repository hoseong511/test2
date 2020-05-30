import java.util.Random;

public class M3d27_Quiz2 {
	public static void main(String[] args) {

		Random r = new Random();
		int randomDice = r.nextInt(6);
		randomDice = randomDice + 1;

		if (randomDice == 1) {
			System.out.println("멍멍");

		} else if (randomDice == 2) {
			System.out.println("야옹");

		} else if (randomDice == 3) {
			System.out.println("3");

		} else if (randomDice == 4) {
			System.out.println("4");

		} else if (randomDice == 5) {
			System.out.println("5");

		} else {
			System.out.println("6");
		}

	}
}
