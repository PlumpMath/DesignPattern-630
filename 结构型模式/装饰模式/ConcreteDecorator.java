package 装饰模式;

// 具体装饰ConcreteDecorator
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	// 定义自己的方法
	private void method(){
		System.out.println("装饰");
	}
	
	// 重写operation方法
	public void operation(){
		this.method();
		super.operation();
	}

}
