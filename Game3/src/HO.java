import java.util.Scanner;

public class HO extends Player{

	HO(){
		this.name = "HORANG";
		this.hp = 5000;
	}
	public void underAttack(Player attacker) {
		super.underAttack(attacker);
		this.skill();
		
	}
	
	public void skill() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			int inputSkill = s.nextInt();
		
			System.out.println("선택해주세요. 1.힐 2. 3. 턴 종료");
			
			if (inputSkill == 1) {
				
				System.out.println(this.heal());			
				
			}
			else if (inputSkill == 2) {
				
			}
			else if (inputSkill == 3) {
				
			}
			else {
				System.out.println("다시 눌러 주세요");
			}
		}
		
			
	}
	public String heal() {
		
		this.hp = this.hp + hp;
		return this.name + "이 체력을 회복했습니다." + "현재 HP : " + this.hp; 
	}
	
	
	
	
}
