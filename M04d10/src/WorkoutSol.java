import java.util.Scanner;

public class WorkoutSol {
	public static void main(String[] args) {
		Exerc save = new Exerc();
		Scanner s = new Scanner(System.in);
		
		// 줄 계산 조절용 
		System.out.println("시작하려면 엔터");
		for (int i = 0; i < 99999; i++) {
			
			s.nextLine();
			
			System.out.println("숫자를 입력해주세요 \n1. 입금\n2. 메시지 + 입금\n3. 인출(crash)");
			
			String inputStr = s.nextLine();
			

			//if문을 문자로 받아서 돌리려 했으나 인식을 못하는 문제점 발생함. -> 이전 시간에 배운 .equals활용
			if (inputStr.equals("1")) {           
				System.out.println("금액을 입력해주세요");
				int inputCoin = s.nextInt();
				save.deposit(inputCoin);
			
			}else if (inputStr.equals("2")) {
				
				System.out.println("메시지를 입력해주세요");
//				s.nextLine();
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
		}
		
	}
}
