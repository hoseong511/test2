//학생클래스
public class Review_son extends Review{
	int kor;
	int eng;
	int math;
	int totalScore;
	double avgScore;
	
	Review_son(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public Review_son(String name, int age, int kor, int eng, int math) {
		super(name, age);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.calc();
	}
	public void calc() {
		this.totalScore = this.kor + this.eng + this.math;
		this.avgScore = (double)totalScore / 3;
	}
	
}
