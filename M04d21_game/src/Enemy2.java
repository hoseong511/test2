import java.util.Random;

public class Enemy2 extends Enemy {
	double heal;
	Enemy2(String type, int hp){
		super(type, hp);
	}
	@Override
	public void underAttack() {
		int damage = 20;
		this.hp = this.hp - damage;
		System.out.println(this.type + "은(는) " + damage + "의 피해" );
		
		Random r = new Random();
		int f = r.nextInt(100);
		double healRate = 0.2;
		
		if (0 <= f && f < 20) {    // 회복될 확률
			this.heal = this.hp * healRate; // 체력에 20% 회복
			this.hp = (int)(this.hp + this.heal);
			System.out.println(this.type + "의 " + this.heal +" 회복");

		}
			}
}
