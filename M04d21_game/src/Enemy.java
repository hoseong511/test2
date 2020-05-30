//추상화 abstract -> 오버라이드!!!
import java.util.Random;

public abstract class Enemy {
	String type;
	int hp;
	boolean isLive = true;
	
	Enemy(){
		this.type = "zombie";
		this.hp =100;
		
	}
	
	Enemy(String type, int hp){
		this.type = type;
		this.hp = hp;
		
	}
	public abstract void underAttack();
//	public void underAttack() {
//		if (!this.isLive) {
//			return;
//		}
//		Random r = new Random();
//		int damage = r.nextInt(10) + 10;
//		this.hp = this.hp - damage;
//		System.out.println(this.type + "은(는) " + damage + "의 피해를 받았습니다. 남은 HP " + this.hp );
//		this.checkHp();
//		
//		
//	}
	public void checkHp() {
		if (this.hp < 1) {
			System.out.println(this.type + "를(을) 이겼습니다");
			this.isLive = false;
		}
	}

}
											