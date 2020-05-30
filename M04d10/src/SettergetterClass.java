import java.util.Scanner;

public class SettergetterClass {
	public static void main(String[] args) {
		Settergetter save = new Settergetter();
		Scanner s = new Scanner(System.in);
		
		// 줄 계산 조절용 
		System.out.println("시작하려면 엔터");
		for (int i = 0; i < 99999; i++) {
			s.nextLine();
			
			System.out.println("숫자를 입력해주세요 \n1. 입금\n2. 메시지 + 입금\n3. 인출(crash)");
			
			String inputStr = s.nextLine();
			try {
				if (inputStr.equals("1")) {           
					System.out.println("금액을 입력해주세요");
					int inputCoin = s.nextInt();
					save.deposit(inputCoin);
				
				}else if (inputStr.equals("2")) {
					
					System.out.println("메시지를 입력해주세요");
//					s.nextLine();
					String inputMessage = s.nextLine();
					
					System.out.println("금액을 입력해주세요");
					int inputCoin = s.nextInt();
					save.deposit(inputCoin,inputMessage);
					
				}else if (inputStr.equals("3") || inputStr.equals("crash")) {
					
					System.out.println(save.getAmount() + "원 인출! 종료합니다");
					break;
				} else {
					System.out.println("문자를 다시 입력해주세요");
					
				}
				System.out.println("---------------");
			} catch (Exception e) {
				
				System.out.println("오류! 다시 입력하세요");
				
			}			
			
		}
		
	}

}
