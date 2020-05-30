import java.util.Random;

public class Hong extends Player{
	public Hong() {
		this.name = "홍길동";
		this.hp = 100;
	}

	@Override
	public void underAttack() {
		this.hp = this.hp - 10;
		this.checkHp();
		System.out.println();
		
	}
	public void underAttack(Player p) {
		
		Random r = new Random();
		int damage = 10 + r.nextInt(10);
		this.hp = this.hp - damage;
		System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다.");
		this.checkHp();
		
	}
	
	public void attack(Player target) {
		target.underAttack();
	}

}
