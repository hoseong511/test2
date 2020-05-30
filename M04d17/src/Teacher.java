
public class Teacher extends People{
	String studyClass;
	
	@Override // 부모가 갖고 있는 기능을 재정의 하는 표시
	public String toString() {
		return this.name +" 의 반 : " + this.studyClass + " 나이 : " + this.age;
	}

}
