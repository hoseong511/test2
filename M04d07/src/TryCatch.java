import java.util.Scanner;

public class TryCatch {
	public void doAction() {
		System.out.println("숫자를 입력해주세요");
		
		int userInput = 0;
		Scanner s = new Scanner(System.in);
		
		userInput = s.nextInt();
		try {
			if (userInput % 2 == 0) {
				System.out.println("짝수");
				
			} else {
				System.out.println("홀수");
			}
			
		} catch (Exception e) {
			System.out.println("숫자 만 입력해주세요.");
		}
		
	}
	public double mycalc (double num1, double num2, int num3) {
		double result = 0;
				
		if (num3 == 0) {
			result = num1 + num2; 
		}else if (num3 == 1) {
			result = num1 - num3;
				
		}else if (num3 == 2) {
			result = num1 * num2;
		}else if (num3 == 3) {
			if (num2 == 0) {
				result = 0;
			}			
			result = num1 / num2;
			
		}else if (num3 == 4) {
			result = num1 % num2;
		}else {
			result = 0;
		}
		return result;
	}

}
