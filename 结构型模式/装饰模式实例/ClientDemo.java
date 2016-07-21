package 装饰模式实例;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Benz();
		// 对奔驰车进行装饰
		CarDecorator cd = new ConcreteCarDecorator(car);
		cd.show();
	}

}
