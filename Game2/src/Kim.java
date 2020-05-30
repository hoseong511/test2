import java.util.Random;

public class Kim extends Player {
	int strong = 5;
	Kim() {
		this.name = "김보현";
		this.hp = 100;
		
	}
	
	@Override
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		
		if (attacker.name.equals("김보현")) {
			Kim tmp = (Kim)attacker;
			strong = tmp.strong;
		}
		if (this.isPowerUp()==true) {
			System.out.println(this.name + "은(는)" + attacker.name + "(으)로부터" + strong +  "의 피해를 입었습니다.");
			this.hp = this.hp - strong;
			System.out.println("분노! "+ this.name + "의 공격력이 10올랐습니다.");
			this.strong = this.strong + 10;
		} else {
			System.out.println(this.name + "은(는)" + attacker.name + "(으)로부터" + strong +  "의 피해를 입었습니다.");
			this.hp = this.hp - strong;
		}
		
		this.checkHp();
	}
	
	public boolean isPowerUp() {
		Random r = new Random();
		if (r.nextInt(2) == 1) {
			return true;
		}
		return false;
	}


}
