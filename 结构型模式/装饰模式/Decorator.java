package 装饰模式;

// 装饰Decorator类
// 抽象类
public abstract class Decorator implements Component { 
	private Component component = null; // 实例化抽象构件类
	public Decorator(Component component){
		this.component = component;
	}
	public void operation(){
		this.component.operation();
	}
}
