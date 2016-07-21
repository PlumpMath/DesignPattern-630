package ���ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һ�����ڵ�
		Composite root = new Composite();
		root.operation();
		// ������֦�ڵ�
		Composite branch = new Composite();
		// ����Ҷ�ӽڵ�
		Leaf leaf = new Leaf();
		// �������νṹ
		root.add(branch);
		branch.add(leaf);
	}
	
	// ���������ݹ飩
	public static void display(Composite root){
		for(Component c:root.getChild()) {
			if(c instanceof Leaf){// ����ڵ�������Ҷ�ӽڵ�
				c.operation();
			} else {
				c.operation();
				display((Composite)c);// �ݹ����
			}
		}
	}
}
