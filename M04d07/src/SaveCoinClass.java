import java.util.Scanner;

public class SaveCoinClass {
	// private를 사용하여 직접 내부 접근을 막고 메소드로 입력하게 만듦.(public int는 내부 접근 가능하게 함)
	private int coinAmount = 0; 
	
	Scanner s = new Scanner(System.in);
	
	public void deposit() {
		try {
			System.out.println("금액을 입력해주세요");
			int inputCoin = s.nextInt();		
			// this.를 쓰면 메소드 밖의 변수를 불러 온다는 것을 확인
			// 내부 데이터 변수들은 this를 써서 가독성을 높이자
			this.coinAmount = this.coinAmount + inputCoin; 
			System.out.println("딸그랑 " + inputCoin +"원 입금");
			
		} catch (Exception e) {
		// trycatch 캐치를 여러개 나누기 2.trycatch를 중첩
			// 3. 오류가 발생할 부분만 trycatch를 사용
			
			System.out.println("금액 오류! 다시 입력해주세요");
			
		}
				
	}													
	public void withdraw() {
		
		System.out.println(this.coinAmount + "원 인출");
		this.coinAmount = 0;
		
	} //   다형성에 대해서 !! 같은 함수인데 하는 기능이 여러개 인것 !!!
	public void depositNmessage() {
		try { //try catch를 써서 오류가 안나오고 그냥 지나가는 거구나..
			s.nextLine(); // 엔터를 쳐서 나타나는 문제를 잡아줌.. 엔터도 문자열로 인식하므
			System.out.println("메시지를 입력해주세요");
			String inputMessage = s.nextLine();
			
			
			
			System.out.println("금액을 입력해주세요");
			int inputCoin = s.nextInt();
			
			
			this.coinAmount = this.coinAmount + inputCoin;
			System.out.println("당신의 메시지: '" + inputMessage +"' 입금액: " + inputCoin + "원");
		} catch (Exception e) {
			
			System.out.println("금액 오류! 다시 입력해주세요");
			
		}		
	}
	//세터  게터가 있는 것이 기본!!(여기서 deposit하고 withdraw??)
	
}
