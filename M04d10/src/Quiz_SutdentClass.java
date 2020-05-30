import java.util.Scanner;

public class Quiz_SutdentClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.println("학생 인원 수?");
		int studentNum = scan.nextInt();		
		
		Quiz_Student[] s = new Quiz_Student[studentNum];
		for (int i = 0; i < s.length; i++) {
			scan.nextLine();
			System.out.println("학생이름은?");
			String inputname = scan.nextLine();
			
			System.out.println("국어점수?");
			int inputkoreanScore = scan.nextInt();
			
			System.out.println("수학점수?");
			int inputmathScore = scan.nextInt();
			
			System.out.println("영어점수?");
			int inputenglishScore = scan.nextInt();
			
			s[i] = new Quiz_Student(inputname, inputkoreanScore, inputmathScore, inputenglishScore);
					
		}
		int totalSum = 0;
		double totalAvg = 0;
		for (int i = 0; i < s.length; i++) {
			totalSum = totalSum + s[i].sumScore;
			totalAvg = totalAvg + s[i].avgScore;
			
			System.out.println("학생이름은 " + s[i].name +
								", 국어점수는 " + s[i].koreanScore +
								", 수학점수는 " + s[i].mathScore + 
								", 영어점수는 " + s[i].englishScore +
								", 총 점은 " + s[i].sumScore +
								", 평균은 " + s[i].avgScore +"점");
			
		}
		double resultAvg = totalAvg / s.length;
		System.out.println("학생들의 총 점은 "+ totalSum + ", 평균은 " + resultAvg);
				
		for (int i = s.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (s[j].sumScore < s[j+1].sumScore) {
					
					int a = s[j].sumScore;
					s[j].sumScore = s[j+1].sumScore;
					s[j+1].sumScore = a;
					String b = s[j].name;
					s[j].name = s[j+1].name;
					s[j+1].name = b;
				}				
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println((i+1) + "등" + s[i].name + ", 총 점: "+ s[i].sumScore);
		}
	}
}
