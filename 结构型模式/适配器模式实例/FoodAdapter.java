package 适配器模式实例;

// 食品适配器将水饺转换为馄饨
public class FoodAdapter extends ShuiJiao implements Hundun{

	@Override
	public void makeHundun() {// 继承水饺类和馄饨接口，实现馄饨接口方法，在其中调用水饺方法，实现转换
		// TODO Auto-generated method stub
		super.makeShuiJiao();
		System.out.println("馄饨和水饺一样是以面包弦的食品");
	}

}
