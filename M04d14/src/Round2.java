
public class Round2 extends Area{
	
	public Round2(int r) {
		this.r = r;
		this.type = "원";
		this.calcSize();
	}
	@Override
	public void calcSize() {
		this.size = this.r * this.r * Math.PI;
	}
	

}
