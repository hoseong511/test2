import java.util.Random;

public class Player_sup extends Player{
//	int heal;
//	int attackUp=0;
	final int hp1st;
	Player_sup(String type, int hp, int attack){
		super(type, hp, attack);
		this.hp1st = hp;
	}
	public int attack_buff() {
		Random r = new Random();
		int f = r.nextInt(100);
		double upRate = 0.1;
		
		if (0 <= f && f < 50) {    // 증가할 확률
									// 공격력 10% 증가
			this.attackUp = (int)(this.attack * upRate);
			return this.attackUp;
		}else {
			return 0;
		}
		
	}

	
	public int heal_buff() {
		Random r = new Random();
		int f = r.nextInt(100);
		double upRate = 0.2;
		
		if (0 <= f && f < 50) {    // 회복될 확률
			// 체력에 20% 회복
			
			this.heal = (int)(this.hp * upRate);
			int tmp = this.hp + this.heal;
			if (tmp > this.hp1st) {
				tmp = this.hp1st;
				return tmp;
			}
			return tmp;
		
			
		}else {
			return this.hp;
		}
		
	}



	@Override
	public void playerturn() {
		
		this.attack = this.attack + this.attack_buff();
		
//		System.out.println("공격력 증가" + this.attack+"  "+ "공격력 "+this.attackUp);
//		System.out.println("HP 증가 " + this.hp+ "  " +"회복량 " +  this.heal);
//		System.out.println("힐" + this.heal );
		
		this.underAttack();
		this.hp = this.heal_buff();
		
//		System.out.println("힐" + this.heal);
	}

}
