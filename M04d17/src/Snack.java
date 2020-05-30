
public class Snack extends People1 {
	int sellOut = 0;
public Snack(String name) {
	this.name = name;
		
}
	
public void sales(int price) {
	this.sellOut = this.sellOut + price;
}
	@Override
	public String toString() {
		
		return this.name + "에게 판매한 금액은  " + this.sellOut;
	}
}
