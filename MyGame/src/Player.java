//보스레이드
//ap플레이어 hp 하,  attack 강
//ad플레이어 hp 중, attack 중
//sup플레이어 hp 중, attack 약, buff 공,힐
//tan플레이어 hp 상, attack 약
//enemy는 hp 최상, attack 하, buff 공, 힐 
//buff 공 -> 50%의 확률로 현재 공격력의 10% 증가
//     
//     힐 -> 50%의 확률로 현재 hp의 20% 회복
import java.util.Random;

public class Player {
	
	String type;
	int hp;
	boolean isLive = true;
	
	public Player() {
		
	}
	
	public void underAttack(Player attacker) {
		if (!this.isLive) {
			return;
		}		
	
		System.out.println(this.type + "의 hp : " + this.hp);
		
	}
	
	public void checkHp() {
		if (this.hp < 1 ) {
			this.hp = 0;
			this.isLive = false;
		}
	}
	

}
