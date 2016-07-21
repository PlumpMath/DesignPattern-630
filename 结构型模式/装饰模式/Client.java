package 装饰模式;

// 对装饰模式进行应用
public class Client {
	public static void main(String args[]){
		Component component = new ConcreteComponent();
		// 进行装饰
		component = new ConcreteDecorator(component);
		component.operation();
	}
}
