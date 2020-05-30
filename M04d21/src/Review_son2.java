//선생님 클래스
public class Review_son2 extends Review{
	String className;
	Review_son[] student;
	
	public Review_son2(String name, int age, String className,Review_son[] student) {
		super(name, age);
		this.className = className;
		this.setStudent(student); //아니네.. 인자로 받아야 하네 그냥 보여주기 식 메소드였네
	}
//	메소드를 넣어주면 생성자에서 빼줘도 되네..
	public void setStudent(Review_son[] student) {
		this.student = student;
	}
	public void sort() {
		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if (student[i].totalScore < student[i+1].totalScore) {
					Review_son temp = student[i];
					student[i] = student[j];
					student[j] = temp;  // 이렇게 배열로 담아서 변경할 수 있었네.. 생각을 못했다.
				}
			}
		}
	}
//	public void sort2(){
//		
//		Arrays.sort2(student, new 	Comparable<Review_son>)(){
//				
//		}
//	}
	public void printStudent() {
		this.sort();
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i] + " 총점 : " + student[i].totalScore);
		}
	}
	

}
