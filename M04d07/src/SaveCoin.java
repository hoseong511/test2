import java.util.Scanner;

public class SaveCoin {
	public static void main(String[] args) {
		SaveCoinClass save = new SaveCoinClass();
		Scanner s = new Scanner(System.in);
		
		
		for (int i = 0; i < 99999; i++) {
			System.out.println("숫자를 입력해주세요 \n1. 입금\n2. 메시지 + 입금\n3. 인출(crash)");
			
			String inputStr = s.nextLine();

			//if문을 문자로 받아서 돌리려 했으나 인식을 못하는 문제점 발생함. -> 이전 시간에 배운 .equals활용
			if (inputStr.equals("1")) {           
								
				save.deposit();
			
			}else if (inputStr.equals("2")) {
				
				save.depositNmessage();
				
			}else if (inputStr.equals("3") || inputStr.equals("crash")) {
				
				save.withdraw();
				break;
			} else {
				System.out.println("문자를 다시 입력해주세요");
				
			}
			System.out.println("---------------");
		}
		
	}
}
