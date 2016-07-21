package 装饰模式实例;

// 汽车装饰抽象类CarDecorator
public abstract class CarDecorator implements Car{
	private Car car = null;
	public CarDecorator(Car car){
		this.car = car;
	}
	public void show(){
		this.car.show();
	}
}
