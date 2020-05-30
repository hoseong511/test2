import java.util.Scanner;

public class kaupIndexClass {
	private double weight;
	private double height;
	Scanner s = new Scanner(System.in);	
	
	public void userInput() {
		System.out.println("체중(kg)을 입력하시오");
		//nextInt -> 정수만 입력받음  nextDouble -> 실수 입력 받음
		double inputWeight = s.nextDouble();  
		this.weight = this.weight + inputWeight;
		
		System.out.println("키(m)를 입력하시오");
		double inputHeight = s.nextDouble();
		this.height = this.height + inputHeight;
			
	}
	
	public void kaupCalc() {
		double kaup = this.weight / (this.height * this.height);
		System.out.println("카우프 지수는 " + kaup);
		if (kaup >= 30) {
			System.out.println("비만");
			
		}else if (kaup >= 24) {
			System.out.println("과체중");
						
		}else if (kaup >= 20) {
			System.out.println("정상");
		}else if (kaup >= 15) {
			System.out.println("저체중");
		}else if (kaup >= 13) {
			System.out.println("여윔");
		}else if (kaup >= 10) {
			System.out.println("영양 실조증");
		}else {
			System.out.println("소모증");
		}
		
		
	}

}
