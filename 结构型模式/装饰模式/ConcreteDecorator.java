package װ��ģʽ;

// ����װ��ConcreteDecorator
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// �����Լ��ķ���
	private void method(){
		System.out.println("װ��");
	}
	
	// ��дoperation����
	public void operation(){
		this.method();
		super.operation();
	}

}
