import java.util.Scanner;

public class Math1 {
	public void sumTwoNum(int num1, int num2) {
		int resultNum = num1 + num2;
		System.out.println("합: " + resultNum);
	}
	
	public void mul3(int num1) {   // void는 매소드에서 실행된 코드 그대로 반환한다는 뜻
									//return이 있을 경우에만 return에 맞춰 알맞게 void를 수정
		int resultNum = num1 * 3;
		System.out.println("3배: " + resultNum);
	}
	public int test2(int num1) {
		int resultNum = num1 * 3;
		return resultNum;
	}
	public void inputSum() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		int inputNum1 = s.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int inputNum2 = s.nextInt();
		
		System.out.println("두 수의 합은: " + (inputNum1 + inputNum2) + "입니다");
	}

}
