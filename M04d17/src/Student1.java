
public class Student1 extends People1 {
	int mathScore;
	int engScore;
	int korScore;
	int total;
	double avg;
	
	public Student1(String name, int age, int korScore, int engScore, int mathScore) {
		super(name,age);
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.korScore = korScore;
		this.calcScore();
	}
	public void calcScore() {
		this.total = this.mathScore + this.engScore + this.korScore;
		this.avg = (double)this.total / 3;
		
	}
	@Override
	public String toString() {
		
		return " 총 점 : " + this.total+
				" 평균 : "+ this.avg	;
	}

}
