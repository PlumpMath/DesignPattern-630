package ���ģʽʵ��;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CEO
		ConcreteCompany root = new ConcreteCompany("����", "CEO", 100000);
		// ���ž���
		ConcreteCompany developDep = new ConcreteCompany("����", "�з�������", 12000);
		ConcreteCompany salasDep = new ConcreteCompany("����", "���۲�����", 12000);
		ConcreteCompany financeDep = new ConcreteCompany("����", "���񲿾���", 12000);
		// ����Ա��
		Employee e1 = new Employee("A", "�з���", 3000);
		Employee e2 = new Employee("B", "�з���", 2500);
		Employee e3 = new Employee("C", "�з���", 4000);
		Employee e4 = new Employee("D", "�з���", 6000);
		Employee e5 = new Employee("E", "���۲�", 3500);
		Employee e6 = new Employee("F", "���۲�", 2300);
		Employee e7 = new Employee("G", "���۲�", 5000);
		Employee e8 = new Employee("H", "����", 3800);
		Employee e9 = new Employee("I", "����", 4300);
		// ������
		root.add(developDep);
		root.add(salasDep);
		root.add(financeDep);
		developDep.add(e1);
		developDep.add(e2);
		developDep.add(e3);
		developDep.add(e4);
		salasDep.add(e5);
		salasDep.add(e6);
		salasDep.add(e7);
		financeDep.add(e8);
		financeDep.add(e9);
		// ��ʾ��˾���
		System.out.println(root.getInfo());
		display(root);
	}

	// ���������ݹ飩
	public static void display(ConcreteCompany root) {
		// TODO Auto-generated method stub
		for(Company c:root.getChild()){// ����ڵ�������Ҷ�ӽڵ�
			if(c instanceof Employee){
				System.out.println(c.getInfo());
			}else{// ��֦�ڵ�
				System.out.println("\n" + c.getInfo());
				display((ConcreteCompany)c);// �ݹ����
			}
		}
	}

}
