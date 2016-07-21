package 外观模式;

public class Facade {
	// 被委托的对象
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();
	// 提供外界的方法
	public void methodA(){
		a.methodA();
	}
	public void methodB(){
		b.methodB();
	}
	public void methodC(){
		c.methodC();
	}
}
