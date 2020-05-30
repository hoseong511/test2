
public class Settergetter {
	private int amount = 0;
	public void deposit(int amount) {
		
		this.deposit(amount,"딸그랑");
	}
	public void deposit(int amount, String message) {
//		setAmount(amount);
		this.amount = this.amount + amount;	

		System.out.println("메시지! "+message);
		System.out.println("현재잔액은 " + this.amount + "입니다");
		
	}
	public void deposit(String message) {
		this.deposit(100, message);
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmount() {
		return this.amount;
	}


}
