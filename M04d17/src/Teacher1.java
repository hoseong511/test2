
public class Teacher1 extends People1 {
	String className;
	Student1[] student;
	int totalAmount=0;
	double avgAmount=0;
	Snack s ;
	
	public Teacher1(String name, int age, String className, Student1[] student){
		super(name, age);
		this.className = className;
		this.student = student;
		this.rank(student);
		this.cal(student);
		
	}
	public void cal(Student1[] student) {
		for (int i = 0; i < student.length; i++) {
			this.totalAmount = this.totalAmount + student[i].total;
			this.avgAmount = this.avgAmount + student[i].avg;
		}
		this.avgAmount = this.avgAmount / student.length;
	}
	public void rank(Student1[] student) {
		for (int i = student.length-1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				if(student[j].total< student[j+1].total) {
//					총 점바꾸기
					Student1 tmp = student[j+1];
					student[j+1] = student[j]; 
					student[j] = tmp;
////					평균 바꾸기
//					double tmp1 = student[j+1].avg;
//					student[j+1].avg = student[j].avg; 
//					student[j].avg = tmp1;
////					이름바꾸기
//					String tmp2 = student[j+1].name;
//					student[j+1].name = student[j].name; 
//					student[j].name = tmp2;
////					국어 점수 바꾸기
//					int tmp3 = student[j+1].korScore;
//					student[j+1].korScore = student[j].korScore; 
//					student[j].korScore = tmp3;
////					영어 점수
//					int tmp4 = student[j+1].engScore;
//					student[j+1].engScore = student[j].engScore; 
//					student[j].engScore = tmp4;
////					수학점수
//					int tmp5 = student[j+1].mathScore;
//					student[j+1].mathScore = student[j].mathScore; 
//					student[j].mathScore = tmp5;
				}
			}
		}
		
	}
	
	
	@Override
	public String toString() {
		
		return this.className + "반의 등수입니다" ;
	}

}
