package ����ģʽ;

// ���󻯽�ɫ
public abstract class Abstraction {
	// �����ʵ�ֻ���ɫ������
	private Implementor imp;
	public Abstraction(Implementor imp){
		this.imp = imp;
	}
	// ҵ�񷽷�
	public void operation(){
		this.imp.operationImp();
	}
}
