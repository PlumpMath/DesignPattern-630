package ����ģʽʵ��;

// Բ��Circle�̳�ͼ�γ�����AbstractShape
public class Circle extends AbstractShape{

	public Circle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("ʹ��"+color.getColor()+"��Բ��");
	}

}
