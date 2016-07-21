package 装饰模式实例;

// 奔驰汽车Benz（裸车，需要装饰）
public class Benz implements Car{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车的默认颜色是黑色");
	}

}
