
public class Round extends Area{
	int halfLength;
	
	Round(int halfLength){
		this.halfLength = halfLength;
		this.type = "원";
	}
	public void calcSize() {
		this.size = this.halfLength * this.halfLength * Math.PI;
	}
	
}
