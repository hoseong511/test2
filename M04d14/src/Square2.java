
public class Square2 extends Area{
	public Square2(int width, int height){
		this.width = width;
		this.height = height;
		this.calcSize();
		this.type = "사각형";
	}	
	@Override
	public void calcSize() {
		this.size = this.width * this.height;
	}

}
