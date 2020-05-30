import java.util.Random;

public class OhSungHoon extends Player {
	OhSungHoon() {
		this.name = "오성훈";
		this.hp = 100;
	}
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		Random r = new Random();
		int damage = 15 + r.nextInt(10);
		this.hp = this.hp - damage;
		int heal = r.nextInt(10)+5;
		this.hp = this.hp + heal;
		if (this.hp < 100) {
			System.out.println(this.name + "님은 " + damage + "의 피해를 입었습니다");
			System.out.println(this.name + "님은 스킬 사용으로 " + heal + "만큼의 치유를 하였습니다" + "현재 HP의 상태: " + this.hp);
		}
		

		this.checkHp();
	}
}