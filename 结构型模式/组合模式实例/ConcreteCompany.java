package ���ģʽʵ��;

import java.util.ArrayList;

// ��֦�ڵ���
public class ConcreteCompany implements Company{

	private ArrayList<Company> companyList = new ArrayList<Company>();
	private String name;// ����
	private String position;// ְλ
	private int salary;// нˮ
	
	// ���캯��
	public ConcreteCompany(String name, String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public void add(Company company){
		this.companyList.add(company);
	}
	
	public void remove(Company company){
		this.companyList.remove(company);
	}
	
	public ArrayList<Company> getChild(){
		return this.companyList;
		
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
