package װ��ģʽʵ��;

// ����װ�γ�����CarDecorator
public abstract class CarDecorator implements Car{
	private Car car = null;
	public CarDecorator(Car car){
		this.car = car;
	}
	public void show(){
		this.car.show();
	}
}
