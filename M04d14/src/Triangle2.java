
public class Triangle2 extends Area {
	
	public Triangle2(int width, int height) {
		this.width = width;
		this.height = height;
		this.calcSize(); 
		this.type = "삼각형";
	}
//	계산 calcsize빼고는 부모의 클래스를 따라감
	@Override
	public void calcSize() {
		this.size = (double)this.width * this.height / 2 ;
	}

}
