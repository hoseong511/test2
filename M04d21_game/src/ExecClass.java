import java.util.Random;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Enemy[] enemy = new Enemy[4];
//		Enemy2[] enemy = new Enemy2[4];
		
		enemy[0] = new Enemy();
		enemy[1] = new Enemy2("oc",150);
		enemy[2] = new Enemy2("devil",200);
		enemy[3] = new Enemy2("dragon",1000);
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.println("턴 진행 (엔터!)");
			scan.nextLine();
			
			int enemyIndex = r.nextInt(4);
			enemy[0].underAttack();
			enemy[1].underAttack();
			enemy[2].underAttack();
			enemy[3].underAttack();
			
			if (!enemy[0].isLive && !enemy[1].isLive && !enemy[2].isLive && !enemy[3].isLive) {
				System.out.println("게임종료");
			}
		}
		
	}

}
