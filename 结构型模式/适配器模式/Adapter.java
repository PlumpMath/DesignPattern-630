package 适配器模式;

public class Adapter extends Adaptee implements Target{

	// 通过适配器Adapter，可以将Adaptee类转换为Target接口
	@Override
	public void request() {// 实现接口的类
		// TODO Auto-generated method stub
		super.specificRequest();
	}

}
