package ���ģʽʵ��;

public class Employee implements Company{
	
	private String name;// ����
	private String position;// ְλ
	private int salary;// нˮ
	
	// ���캯��
	public Employee(String name, String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}

}
