import java.util.Scanner;

public class ExecClass0417_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = 100;
		People1[] id = new People1[num];
		Teacher1 teacher;
		Student1[] student = new Student1[num];
		System.out.println("1.학생 2.선생님 3.매점");
		int opt = s.nextInt();
		
		if (opt == 1) {	
			Student1 cal;
			System.out.println("성적계산기입니다.");
			
			System.out.println("국어 점수는? ");
			int korScore = s.nextInt();
			
			System.out.println("영어 점수는? ");
			int engScore = s.nextInt();
			
			System.out.println("수학 점수는? ");
			int mathScore = s.nextInt();
			
			cal = new Student1(korScore, engScore, mathScore);
			System.out.println(cal.toString());
			
		}
		
		else if (opt == 2) {
			
			System.out.println("학생성적관리 프로그램입니다!");
						
			s.nextLine();
			System.out.println("성적을 입력할 반?");
			
			String inputClass = s.nextLine();
			
			int count = 0;		
			student = new Student1[num];					
		
			for (int i = 0; i < num; i++) {
				s.nextLine();
				System.out.println("이름?(종료를 원하시면 q를 입력해주세요)");
				String inputName = s.nextLine();
				
				if (inputName.equals("q")) {
					break;
				}
				
				System.out.println("나이?");
				int inputAge = s.nextInt();				
							
				System.out.println("국어 점수?");
				int inputKor = s.nextInt();
				
				System.out.println("영어점수?");
				int inputEng = s.nextInt();
				
				System.out.println("수학점수?");
				int inputMath = s.nextInt();
								
				student[i] = new Student1(inputName, inputAge, inputKor, inputEng, inputMath);
				id[i] = new People1(inputName, inputAge);
				count = count + 1;
			}
			teacher = new Teacher1(inputClass,student);
			
			
			int totalScore = 0; // 학생들의 총 합
			double avgScore = 0; // 학생들의 평균
			for (int i = 0; i < count; i++) {
				totalScore = totalScore + student[i].total;
				avgScore = avgScore + student[i].avg;
			}
			avgScore = avgScore / count;
			for (int i = count-1; i > 0; i--) {
				
				for (int j = 0; j < i; j++) {
					if(student[j].total< student[j+1].total) {
						int tmp = student[j+1].total;
						student[j+1].total = student[j].total; 
						student[j].total = tmp;
					}
				}
			}
			System.out.println(teacher + "학생들의 총 합 : " + totalScore + "\n평균은 : " + avgScore);
			
			for (int i = 0; i < count; i++) {
				System.out.println((i+1)+"등 "+teacher.student[i].name + " 총 점 : " + teacher.student[i].total);
			}
					
		}
		
	}

}

