//  1. 객체데이터 만들기
//	2. 생성자 만들기 -> 하나하나 데이터를 넣지 않도록 도와줌
//	3. 계산식 작성
//	4. 출력 메소드 작성
//	5. 상속개념 적용 -> extends
//	6. 부모의 객체데이터와 생성자를 그대로 씀
//	7. 그 중 하나의 메소드만 변경하여 사용가능
public class Square {
	int width;
	int height;
	String type;
	int size;
	
	public Square(int width, int height) {
		this.width = width;
		this.height = height;
		this.type = "사각형";
	}
	
	public void calcSize() {
		this.size = this.width * this.height;
	}
	
	public void printSize() {
		this.calcSize();
		System.out.println(this.type + " 크기 " + this.size);
	}

}
