import java.util.Random;
import java.util.Scanner;

public class M3d27_Quiz4 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("화면에 주사위를 굴릴까요?");

		String userEnter = s.nextLine();
		int userDice = r.nextInt(6);
		System.out.println((userDice + 1));
		System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
		String comEnter = s.nextLine();
		int comDice = r.nextInt(6);
		System.out.println((comDice + 1));

		if (userDice > comDice) {
			System.out.println("You Win");
			
		} else if (userDice < comDice) {
			System.out.println("You Lose!");
			
		} else {
			System.out.println("Draw");
		}

	}

}
