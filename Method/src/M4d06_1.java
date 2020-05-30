import java.util.Scanner;

public class M4d06_1 {
	public static void main(String[] args) {
		Math1 mmmm = new Math1(); //mmmm이라는 객체변수 지정
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해주세요");
		int inputNum1 = s.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
		int inputNum2 = s. nextInt();
		
		mmmm.sumTwoNum(inputNum1,inputNum2);
		
		int numReturn = mmmm.test2(5050);
		System.out.println(numReturn);
		
		mmmm.inputSum();
	}

}
