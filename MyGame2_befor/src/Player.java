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

public abstract class Player {
	
	String type;
	int hp;
	int heal;
	int attackUp;
	int attack;
	boolean isLive = true;
	
	public Player() {
		this.type = "AI";
		this.hp = 100;
	}
	
	public Player(String type, int hp, int attack) {
		this.type = type;
		this.hp = hp;
		this.attack = attack;
		
	}
	public void underAttack() {
		if (!this.isLive) {
			return;
		}
		
		this.checkHp();
		System.out.println(" " + this.type + "의 hp " + this.hp);
		
	}
	
	public void checkHp() {
		if (this.hp < 1 ) {
			this.hp = 0;
			this.isLive = false;
		}
	}
	public abstract void playerturn();

}
