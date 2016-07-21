package 桥梁模式实例;

// 正方形
public class Square extends AbstractShape{

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("使用"+color.getColor()+"画正方形");
	}
	
}
