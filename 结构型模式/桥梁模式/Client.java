package 桥梁模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个实现化角色
		Implementor imp = new ConcreteImplementor();
		// 定义一个抽象化角色
		Abstraction abs = new RefinedAbstraction(imp);
		// 执行
		abs.operation();
	}

}
