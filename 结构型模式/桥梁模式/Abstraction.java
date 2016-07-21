package 桥梁模式;

// 抽象化角色
public abstract class Abstraction {
	// 定义对实现化角色的引用
	private Implementor imp;
	public Abstraction(Implementor imp){
		this.imp = imp;
	}
	// 业务方法
	public void operation(){
		this.imp.operationImp();
	}
}
