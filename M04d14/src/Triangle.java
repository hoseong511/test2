// 상속! -> Square 클래스를 상속함 부모 square 자식 triangle
public class Triangle extends Square{
	public Triangle(int width, int height) {
		super(width, height);
		this.type = "삼각형";
	}
//	계산 calcsize빼고는 부모의 클래스를 따라감
	public void calcSize() {
		this.size = this.width * this.height / 2 ;
	}
}
