//1. 프로그램에서 이용가능한 메뉴는 3개입니다.(학생, 선생님, 매점) 
//2. 입력창에 당신의 메뉴에 따라 다르게 프로그램이 실행됩니다.
//(단, 처음 이용 시 학생들 정보 입력이 필수입니다.)
//학생, 반을 추가하는 기능 x
//선생님 메뉴에서 학생의 성적을 수정하는 기능
//매점 메뉴에서 학생들에게 판매한 금액 입력, 조회 기능




import java.util.Scanner;

public class AdminClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생관리를 시작하세요!");
		scan.nextLine();
		System.out.println("선생님의 성함을 입력해주세요!");
		String teacherName = scan.nextLine();		
		
		System.out.println("안녕하세요! "+ teacherName +" 선생님! 관리할 반의 이름은 무엇입니까?");
		String className = scan.nextLine();
		
		System.out.println(className + "반의 학생 수가 어떻게 됩니까?");
		int classNum = scan.nextInt();
		
		People1[] people = new People1[classNum];
		Student1[] student = new Student1[classNum];
		Teacher1 teacher;
		Snack[] snack = new Snack[classNum];

//		people에는 이름과 나이 정보
		System.out.println("학생들의 명부를 작성할 차례입니다.\n학생 정보를 입력해주세요");
		
//		학생들의 신상정보를 입력받을 반복문
		for (int i = 0; i < people.length; i++) {
			scan.nextLine();
			System.out.println((i+1) +". 학생 이름?");
			String studentName = scan.nextLine();
			
			System.out.println("학생 나이?");
			int studentAge = scan.nextInt();
			
//			people에 이름과 나이를 저장
			people[i] = new People1(studentName, studentAge);
//			입력받은 student의 이름 정보만 snack에 저장 -> 매점시스템에 이름 정보 저장
			snack[i] = new Snack(people[i].name);
		}
//		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i+1) +". "+people[i].name + "의 성적을 입력할 차례입니다");
			
			System.out.println("국어 점수?");
			int inputKor = scan.nextInt();
			
			System.out.println("영어점수?");
			int inputEng = scan.nextInt();
			
			System.out.println("수학점수?");
			int inputMath = scan.nextInt();
//			people의 이름과 나이를 student에 저장, 국어,영어, 수학 점수를 저장				
			student[i] = new Student1(people[i].name,people[i].age, inputKor, inputEng, inputMath);

		}
		teacher = new Teacher1(teacherName, 0, className, student);
		System.out.println("성적 입력이 끝났습니다.\n이제 프로그램을 이용하세요!");
				
//		프로그램 진입
//		1. 학생은 자신의 성적과 총 점과 평균을 그리고 반 등수 확인 가능
//		2. 선생님은 학생의 과목별 점수와 총 합, 평균 그리고 학생들의 총 점, 평균, 등 수를 확인
//		3. 매점아저씨는 학생에게 판매한 금액 입력, 학생들에게 판매한 금액 집계 가능.
//		프로그램이 작동하는 반복문-> 무한 루프 방지를 위한 for문
		for (int i = 0 ; i < 100; i++) {
			System.out.println("메뉴를 선택해주세요(1.학생 2.선생님 3.매점아저씨)");
			int opt = scan.nextInt();
			
			if (opt == 1) {
				scan.nextLine();
				System.out.println("이름을 입력해주세요");
				String name = scan.nextLine();
				
//				위치를 저장할 변수
				int index = 0;
				
//				이름의 위치를 찾을 반복문
				for (int j = 0; j < student.length; j++) {
					
					if (name.equals(teacher.student[j].name)) {
						index = index + j;
						break; //위치를 찾으면 탈출
					}									
				}
//				위치에 해당되는 학생의 총 점과 평균 그리고 등 수를 출력
				System.out.println(teacher.student[index].toString() +
									" " + (index+1) + "등");											
			}
			
			else if (opt == 2) {
//				각 과목의 점수를 출력하는 반복문
				System.out.println("1. 학생 점수 수정  2. 성적");
				int opt_t = scan.nextInt();
				
				if (opt_t == 1) {
					scan.nextLine();
					System.out.println("이름을 입력해주세요");
					String name = scan.nextLine();
					
//					위치를 저장할 변수
					int index = 0;
					
//					이름의 위치를 찾을 반복문
					for (int j = 0; j < student.length; j++) {
						
						if (name.equals(teacher.student[j].name)) {
							index = index + j;
							break; //위치를 찾으면 탈출
						}									
					}
					System.out.println("수정 할 국어 점수?");
					int inputKor = scan.nextInt();
					
					System.out.println("수정 할 영어 점수?");
					int inputEng = scan.nextInt();
					
					System.out.println("수정 할 수학 점수?");
					int inputMath = scan.nextInt();
					student[index] = new Student1(student[index].name,student[index].age,inputKor,inputEng,inputMath);
					
//					teacher.student = student;
					teacher = new Teacher1(teacherName, 0, className, student);
					
				}
				else if (opt_t == 2) {
					for (int j = 0; j < student.length; j++) {
						System.out.println( teacher.student[j].name+
											" 국어 "+ teacher.student[j].korScore+
											" 영어 "+ teacher.student[j].engScore+
											" 수학 "+ teacher.student[j].mathScore+
											" "+ teacher.student[j]);						
					}
					System.out.println("학생들 총 점 "+teacher.totalAmount+
											" 평균 " + teacher.avgAmount);
//					모든 정보가 한 번에 나오는 것을 방지
					scan.nextLine();
					scan.nextLine();					
//					등 수를 출력하는 반복문
					System.out.println(teacher.toString());
					for (int k = 0; k < student.length; k++) {
						System.out.println((k+1)+"등 "+teacher.student[k].name +
											" 총 점 : " +teacher.student[k].total);
					}
				}
				else {
					System.out.println("잘못누르셨습니다. 다시 눌러 주세요");
				}				
			}
			
//			1. 선택받기 -> 1. 학생, 2. 매출 
//			2. 학생 이름을 입력 받음
//			3. 위에서 저장한 snack에서 이름을 찾아옴
//			4. 찾아온 이름에 금액 저장
//			5. 0을 누르면 매점시스템 종료 -> 다시 접속했을 때 이전에 저장한 매출 조회가능
		
			else if (opt == 3) {
				System.out.println("매점시스템입니다");		
				
//				매점시스템이 작동하는 반복문-> 무한 루프 방지를 위한 for문
				for (int j = 0; j < 100; j++) {
					
					System.out.println("1.학생 2.매출");
					int opt2 = scan.nextInt();
										
					if (opt2 == 1) {
						scan.nextLine();
						System.out.println("학생이름?");
						String name = scan.nextLine();
						int index = 0;
						for (int k = 0; k < snack.length; k++) {
							if (name.equals(snack[k].name)) {
								index = index + k;
								break;
							}
						}						
						System.out.println("판매액?");
						int price = scan.nextInt();
						snack[index].sellOut = snack[index].sellOut + price;								
						System.out.println(snack[index]);
						
					}
					else if (opt2 == 2) {
						for (int k = 0; k < snack.length; k++) {
							System.out.println(snack[k].name+" "+snack[k].sellOut + "원");
							
						}
						System.out.println("매점시스템 종료 시 0을 입력해주세요");
					}
					else if (opt2 == 0) {
						System.out.println("매점시스템을 종료합니다");
						break;
					}
					else {
						System.out.println("다시 입력해주세요");
					}					
				}			
			}
//			종료
			else if (opt == 0) {
				System.out.println("종료합니다");
				break;
			}
			else {
				System.out.println("잘못누르셨습니다 다시 입력해주세요!");
				continue;				
			}
			
			System.out.println("프로그종료를 원하시면 0을 입력해주세요");
				
				
			
		}	
	}
}
