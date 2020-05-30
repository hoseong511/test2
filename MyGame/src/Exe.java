import java.util.Random;
import java.util.Scanner;

public class Exe {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		Player[] player = new Player[5];
		
		player[0] = new Player_sup("서폿", 150, 10);
		player[1] = new Player_tan("탱커", 200, 10);
		player[2] = new Player_ad("전사", 150, 15);
		player[3] = new Player_ap("법사", 100, 20);		
		player[4] = new Enemy_boss("용용죽겠지", 1000, 18);	
		
		System.out.println("진행!");
		
		for (int i = 0; i < 100; i++) {	
			s.nextLine();
			
			int totalAttack = 0;
			
			for (int j = 0; j < player.length-1; j++) {	
				if (player[j].isLive) {
					player[j].hp = player[j].hp - player[4].attack;
					System.out.println("받은 피해량 " + player[4].attack);
					player[j].playerturn();
					System.out.println(player[j].heal + "회복!" +" hp " + player[j].hp);
					totalAttack = totalAttack + player[j].attack;
				}
				
				System.out.println();
			}			
			
//			s.nextLine();
			
			player[4].hp = player[4].hp - totalAttack; 
			System.out.println("당신이 가한 데미지 " + totalAttack);
			player[4].playerturn();
			
			
			if (!player[4].isLive||(!player[0].isLive && !player[1].isLive && 
					!player[2].isLive && !player[1].isLive)) {
				if (!player[4].isLive) {
					System.out.println("당신이 "+ player[4].type + "을 물리 쳤습니다!");
					
				}
				else {
					System.out.println("GAMEOVER");
				}
				System.out.println("종료합니다");
				break;
				
			}			
			System.out.println("다음 턴 !");
		}		
	}
	
}


