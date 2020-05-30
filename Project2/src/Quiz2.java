import java.util.Random;

public class Quiz2 {
	public static void main(String[] args) {
		Random r = new Random();
		int randomValue = r.nextInt(100);
		
		int evenOdd = randomValue % 2;
		
		System.out.println("임의의 값은: " + randomValue);
		
		if (randomValue == 0) {
			System.out.println("임의의 값이 0입니다 ");
			
		}
		else if (evenOdd == 0) {
			
			System.out.println("나머지 값은: "+ evenOdd +" 짝수 입니다");
			
		}
		
		else {
			
			System.out.println("나머지 값은: " + evenOdd + " 홀수 입니다");
		}
			
		
	}

}
