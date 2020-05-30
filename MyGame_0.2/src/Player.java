
public class Player {
	String name;
	int hp;
	int damage;
	boolean isLive = true;
	
	public void underAttack(Player attacker) {
		if (!this.isLive) {
			return;
		}
	}
	
	@Override
	public String toString() {
		return this.name + "의 HP : " + this.hp;
	}
	
	public void checkHp() {
		if (this.hp < 1) {
			this.hp = 0;
			isLive = false;
		}
	}
}
