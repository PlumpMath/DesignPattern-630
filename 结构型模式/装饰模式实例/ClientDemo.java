package װ��ģʽʵ��;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Benz();
		// �Ա��۳�����װ��
		CarDecorator cd = new ConcreteCarDecorator(car);
		cd.show();
	}

}
