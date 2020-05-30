
public class Enemy_boss extends Player{
	
	Enemy_boss(String type, int hp, int attack){
		super(type, hp, attack);

		
	}

	@Override
	public void playerturn() {
		this.underAttack();
		
		// TODO Auto-generated method stub
		
	}
	

}
