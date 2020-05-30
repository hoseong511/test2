import java.util.Random;

public class Hong extends Player {
	Hong() {
		this.name = "홍길동";
		this.hp = 100;
		this.damage = 200;
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);

		Random r = new Random();
//		attacker.damage = this.damage + r.nextInt(10);
		this.hp = this.hp - attacker.damage;
		System.out.println(this.name + "은(는) " + attacker.damage + "의 피해를 입었습니다.");

		this.checkHp();
	}
}
