import java.util.Scanner;

public class M4d06_Qna {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 99999; i++) {
			System.out.println("숫자를 입력하세요. 종료시 q 입력");
			String inputString = s.nextLine(); // 특정한 대상에게 명령을 한다 -> 메서드(nextLine())
			
			if (inputString.equals("q")) { // 숫자를 비교할 때 논리 연산자 사용, 왜냐하면 문자에서 오류가 발생 가능성 있음
				break;
			}
			int convertNumber = Integer.parseInt(inputString);
			
			if (convertNumber % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		// 1. 입력을 숫자 ? 문자?
		// 2. 전부 문자로 입력 받기
	}

}
