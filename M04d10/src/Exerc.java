
public class Exerc {
//	int amount = 0;
	private int amount = 0;
//	수업 2
//	Exerc(){
//		this.amount = 10000;
//	}
//	Exerc(int amount){
//		this.amount = amount;
//	}
//	Exerc(int amount, String name){
//		this.amount = amount;
//	}
//	수업1
	public void deposit(int amount) {
		
		this.deposit(amount,"딸그랑");
	}
	public void deposit(int amount, String message) {
		setAmount(amount);
//		this.amount = this.amount + amount;
		System.out.println(message);
		System.out.println("현재잔액은 " + getAmount() + "입니다");
		
	}
	public void deposit(String message) {
		this.deposit(100, message);
	}
	public void setAmount(int amount) {
		this.amount = this.amount + amount;          //세터 케터는 형식이 정해져있음 this.amount += amount 이렇게 쓰면 안됨
	}
	public int getAmount() {
		return this.amount;
	}

}
