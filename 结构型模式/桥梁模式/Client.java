package ����ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һ��ʵ�ֻ���ɫ
		Implementor imp = new ConcreteImplementor();
		// ����һ�����󻯽�ɫ
		Abstraction abs = new RefinedAbstraction(imp);
		// ִ��
		abs.operation();
	}

}
