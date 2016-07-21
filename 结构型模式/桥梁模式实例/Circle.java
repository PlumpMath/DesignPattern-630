package 桥梁模式实例;

// 圆形Circle继承图形抽象类AbstractShape
public class Circle extends AbstractShape{

	public Circle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("使用"+color.getColor()+"画圆形");
	}

}
