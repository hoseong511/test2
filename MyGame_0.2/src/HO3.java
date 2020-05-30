import java.util.Random;
import java.util.Scanner;

public class HO3 extends Player{
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	
	int defence;
	int save_hp;
	int count;
	int tmp ;

	HO3(){
		this.name = "HORANG33";
		this.hp = 10000;
		this.damage = 5000;
		this.defence = 0;	
		this.save_hp = 10000;
			
	}	
	
	public void underAttack(Player attacker) {
		
		super.underAttack(attacker);
		if (this.save_hp < attacker.hp && this.damage < attacker.damage) {
			this.hp = this.hp + attacker.hp;
			this.save_hp = attacker.hp;
			this.damage = (int)((double)attacker.hp / 2); // 상대 데미지를 내 데미지로 만듦
			attacker.damage = (int)((double)attacker.hp / 2);
			System.out.println("<상대가 "+ this.name + "의 HP와 데미지 보다 쎄므로 상대의 HP와 데미지를 조정했습니다>");
			System.out.println(this.name+ " HP : "+ this.hp + " 데미지 : " + this.damage );
			System.out.println(attacker.name+ " HP : "+ attacker.hp + " 데미지 : " + attacker.damage );
		}
		
		System.out.println(this.name+"의 HP : " + this.hp + " 방어력 : " + this.defence);
						
		this.miss(this.save_hp, attacker);
				
		this.count  = this.count +1 ;
//	
		this.skill(attacker);
		
	}
	
	public void skill(Player attacker) {
		if (this.isLive) { 
			for (int i = 0; i < 100; i++) { // 잘못눌렀을떄를 방지
				System.out.println(this.name + "의 차례입니다! 선택해주세요. 1.버프 2.공격 3.턴 종료");
				int inputMenu = s.nextInt();			
				
				if (inputMenu == 1) {
					this.buff(attacker);
					break;					
				}
				else if (inputMenu == 2) {
					this.attack(attacker);
					break;
				}
				else if (inputMenu == 3) {
					break;
				}
				else {
					System.out.println("다시 눌러 주세요");
				}
			}			
		}
		else if (this.hp == 0 && (this.damage < attacker.damage) && (attacker.hp > this.save_hp)) {
			this.hp = this.hp + this.save_hp;
			System.out.println("<강제 밸런스> ");
			attacker.hp = this.hp;
			attacker.damage = (int)((double)this.hp / 2);
			this.isLive = true;
			for (int i = 0; i < 100; i++) { // 잘못눌렀을떄를 방지
				System.out.println(this.name + "의 차례입니다! 선택해주세요. 1.버프 2.공격 3.턴 종료");
				int inputMenu = s.nextInt();			
				
				if (inputMenu == 1) {
					this.buff(attacker);
					break;					
				}
				else if (inputMenu == 2) {
					this.attack(attacker);
					break;
				}
				else if (inputMenu == 3) {
					break;
				}
				else {
					System.out.println("다시 눌러 주세요");
				}
			}			
		}
	
	}
	
	public void buff(Player attacker) {
		for (int i = 0; i < 100; i++) { // 잘못누름을 방지
			System.out.println("1.힐 2.방어업 3.공격업 ");
			int inputSelect = s.nextInt();
			if (inputSelect == 1) {
				System.out.println(this.buff_heal(attacker));
				break;
			}
			else if (inputSelect == 2) {
				System.out.println(this.buff_defence(attacker));
				break;
			}
			else if(inputSelect == 3) {
				System.out.println(this.buff_attack(attacker));
				break;				
			}
			else{
				System.out.println("다시 입력해주세요!!");
				break;
			}			
		}
	}
	
	public void attack(Player attacker) {
		for (int i = 0; i < 100; i++) { // 잘못누름을 방지
			System.out.println("1.공격디버프 2.치명타 3.즉사 ");
			int inputSelect = s.nextInt();
			if (inputSelect == 1) {
				System.out.println(this.attack_debuff(attacker));
				break;
			}
			else if (inputSelect == 2) {
				System.out.println(this.attack_critical(attacker));
				break;
			}
			else if(inputSelect == 3) {
				System.out.println(this.attack_allAttack(attacker));
				break;				
			}
			else{
				System.out.println("다시 입력해주세요!!");
				break;
			}			
		}		
	}
	
	public String buff_heal(Player attacker) {		
		int healRate = r.nextInt(50); // 현재 체력에 ..%를  회복
		int tmp_heal = (int)(this.hp * (healRate + 1) / 100);
		int per20 = (int)(((double)this.hp) / (this.save_hp) * 100) ; 
		int hpUP = this.hp + tmp_heal;
//			System.out.println(tmp_heal+" "+per20);
		if (hpUP > this.save_hp) {
			this.hp = this.save_hp;
			
			return this.name + "의 체력에 "+ (healRate+1) +"% 회복했습니다. 현재 HP : " + this.hp;
		}		
		else {
			if ((per20 < 30)&& (r.nextInt(3) == 1) || r.nextInt(3)== 2)  {
				this.hp = this.save_hp;
				return "체력 30% 미만.. 60% 확률로 전체 회복!" + "HP : " + this.hp;
			}
			this.hp = hpUP;
			
			return this.name + "의 체력에 "+ (healRate+1) +"% 회복했습니다. 현재 HP : " + this.hp;
		}
		
		
		 
	}
	
	public String buff_defence(Player attacker) { // 현재 체력에 0~30%를 방어업
		int defenceRate = r.nextInt(30);		
		this.defence = this.defence + (int)this.hp * (defenceRate + 1) / 100;
		
		return this.name + "의 방어력이 증가했습니다. 방어력 증가" + this.defence;
	}	
	
	public String buff_attack(Player attacker) { // 현재 체력에 0~30%를 방어업
		int attackRate = r.nextInt(90);		
		this.damage = this.damage + (int)this.damage * (attackRate + 1) / 100;
		
		return this.name + "의 공격력이 증가했습니다. 공격력 증가 " + this.damage;
	}
	
	public String attack_debuff(Player attacker) {
		int deBuffRate = r.nextInt(50);
		int tmp_deBuff = (int)attacker.damage  * (deBuffRate + 1) / 100;
		if (tmp_deBuff == 0) {
			System.out.println("효과가 발동하지 않았습니다");
		}
		else {
			attacker.damage = attacker.damage - tmp_deBuff;
			if (attacker.damage < 0) {
				attacker.damage = 0;
			}
			System.out.println("디버프 발동");
		}		
		return attacker.name + "의 데미지 : "+attacker.damage;
	}
	
	public String attack_critical(Player attacker) {
		int criticalRate = r.nextInt(50);
		if(r.nextInt(4) == 1 || r.nextInt(4) == 2 || r.nextInt(4) == 3) {
			System.out.println("치명타 발동");			
			attacker.hp = attacker.hp - this.damage  * 2;
			
			return this.name + "의 치명타 공격 " + (this.damage *2) + " " +attacker.name +"의 체력 : " + attacker.hp;
		}else {
			System.out.println("치명타 발동 x");
			attacker.hp = attacker.hp - this.damage;
			
			return this.name + "의 데미지 " + this.damage + " " +attacker.name +"의 체력 : " + attacker.hp;
		}		
	}
	public String attack_allAttack(Player attacker) {
		
		if(r.nextInt(4) == 1 || r.nextInt(4) == 2 || r.nextInt(4) == 3) {
			
			System.out.println("즉사 발동");	
			attacker.hp = 0;	
			
			return this.name + "의 즉사 공격 " + " " + attacker.name +"의 체력 : " + attacker.hp;
		}else {
			System.out.println("즉사 x");
			attacker.hp = attacker.hp - this.damage;
			
			return this.name + "의 데미지 " + this.damage + " " +attacker.name +"의 체력 : " + attacker.hp;
		}		
	}
	
	public void checkDefence(int tmp,Player attacker) {
		if (tmp > 0) {
					
			this.defence = tmp;		
			System.out.println(this.name + "은(는) " + attacker.damage + "의 피해를 입었습니다.");
			System.out.println("방어력 : " + this.defence + " HP : "+ this.hp);
					
		}
		else if (tmp < 0) {
			this.defence = 0;
			this.hp = this.hp + tmp;
			System.out.println(this.name + "은(는) " + attacker.damage + "의 피해를 입었습니다.");
			this.checkHp();
			System.out.println("방어력 : " + this.defence + " HP : "+ this.hp);
		}
	}
	public void miss(int tmp_hp, Player attacker) {
		if (this.hp < tmp_hp ) {
			int miss = (int)(((double)this.hp) / (this.save_hp) * 100) ; 
			
			if ((miss >= 80) && r.nextInt(10) == 1) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
			}
			else if ((miss >= 50) && (miss < 80)&& r.nextInt(3) == 1) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
			}
			else if ((miss >= 30) && (miss < 50)&& r.nextInt(2) == 1) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
			}
			else if ((miss > 0)&& (miss < 30) && (r.nextInt(4) == 1 || r.nextInt(4) == 2 || r.nextInt(4) == 3)) {
				
				System.out.println(attacker.name + "의 공격을 피했습니다.");
				}
				else {
					this.tmp = this.defence - attacker.damage;
					this.checkDefence(this.tmp, attacker);
				}	
			}
			else {
				this.tmp = this.defence - attacker.damage;
				this.checkDefence(this.tmp, attacker);
			}
		}
		
		@Override
		public void checkHp() {
			if(this.hp < 1 ) {
				this.hp = 0;
				this.isLive = false;
			}
		}
		
		
		
		
}


