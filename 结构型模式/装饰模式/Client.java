package װ��ģʽ;

// ��װ��ģʽ����Ӧ��
public class Client {
	public static void main(String args[]){
		Component component = new ConcreteComponent();
		// ����װ��
		component = new ConcreteDecorator(component);
		component.operation();
	}
}
