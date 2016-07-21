package 桥梁模式;

// 修正抽象化角色
public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	// 修正父类的方法
	public void operation(){
		// 业务代码
	}
}
