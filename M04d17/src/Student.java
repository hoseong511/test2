
public class Student extends People{
	int middleScore;
	int finalScore;
	@Override
	public String toString() {
		return this.name + "의 점수 : " + "중간고사 : " + this.middleScore + " 기말고사 : " + this.finalScore;
	}
	
//	@Override //-> 어노테이션의 편리한 기능!!
//	public void test() {
//		return
//	}

}
