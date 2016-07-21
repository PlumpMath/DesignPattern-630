package 装饰模式实例;

// 汽车修饰实现类ConcreteCarDecorator
public class ConcreteCarDecorator extends CarDecorator{

	public ConcreteCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	// 给车进行彩绘
	private void print(){
		System.out.println("在车尾绘制“新手”字样，颜色是紫色霞光");
	}
	
	// 给车安装GPS设备
	private void setGps(){
		System.out.println("安装GPS定位导航系统");
	}
	
	// 重写show方法
	public void show(){
		super.show();
		this.print();
		this.setGps();
	}
}
