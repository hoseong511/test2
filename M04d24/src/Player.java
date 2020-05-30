
public abstract class Player {
	String name;
	int hp;
	boolean isLive;
	int attack;
	public Player() {
		
	}
	
	public abstract void underAttack();
	
	@Override
	public String toString(){
		
		return this.name + "의 HP : " + this.hp;
		
	}
	
	public void checkHp() {
		if (this.hp < 1) {
			this.isLive = false;
		}
	}

}
