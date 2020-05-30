import java.util.Arrays;
import java.util.Scanner;

public class TodayClass {
	public static void main(String[] args) {
//		
//		Student(String name, int midScore, int finalScore)
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하고자하는 학생 수를 입력해주세요");
		int inputNum = scan.nextInt();
		
		Student[] s = new Student[inputNum];
		
		for (int i = 0; i < s.length; i++) {
			scan.nextLine();
			System.out.println("학생이름을 입력해주세요");
			String inputName = scan.nextLine();
			
			
			System.out.println("중간고사 점수를 입력해주세요");
			int inputMid = scan.nextInt();
			
			System.out.println("기말고사 점수를 입력해주세요");
			int inputFinal = scan.nextInt();
			s[i] = new Student(inputName, inputMid, inputFinal);
		}
			
		int totalMidScore = 0;
		int totalFinaleScore = 0;
		
		for (int i = 0; i < s.length; i++) {
			totalMidScore = totalMidScore + s[i].midScore;
			totalFinaleScore = totalFinaleScore + s[i].finalScore;
		}
		
		double avgMidScore = (double)totalMidScore / s.length;
		double avgFinalScore = (double)totalFinaleScore / s.length;
		System.out.println("중간고사 총합은 " + totalMidScore);
		System.out.println("중간고사 평균은 " + avgMidScore);
		
		
	}

}
