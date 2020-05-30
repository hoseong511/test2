import java.util.Random;

public class MyName extends Player {
	int heal;
	int atk = 30;
	MyName() {
		this.name = "윤수현";
		this.hp = 100;
		
	}
	@Override
	public void underAttack(Player YouName) {
		super.underAttack(YouName);
		if (YouName.name.equals("윤수현")) {
			MyName tmp = (MyName)YouName;
			atk = tmp.atk;
		}
		
		if (this.hp < 20) { // hp가 20 이하이면
			Random random = new Random();
			this.heal = random.nextInt(10); //0부터 9까지 중 랜덤으로 heal해줌
			int damage = random.nextInt(20); 
			this.hp = this.hp + heal;
			System.out.println(this.name + "은(는)" + damage +"의 피해를 입고," + heal + "의 hp를 회복했습니다.남은 hp는 : " + this.hp);
		}else {
			Random r = new Random();
			int damage = r.nextInt(20);
			this.hp = this.hp - damage;
			System.out.println(this.name + "은(는) " + damage + "의 피해를 입었습니다. 남은 hp는 : " + this.hp);
			
		}
		this.checkHp();
	}

}
	
				


	
