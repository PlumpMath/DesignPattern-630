package ���ģʽ;

import java.util.ArrayList;

// ������֦����
public class Composite implements Component{

	// ��������
	private ArrayList<Component> componentList = new ArrayList<Component>();
	
	// ��ӹ���
	public void add(Component component){
		this.componentList.add(component);
	}
	
	// ɾ������
	public void remove(Component component){
		this.componentList.remove(component);
	}
	
	// ��ȡ�ӹ���
	public ArrayList<Component> getChild(){
		return this.componentList;
		
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		// ҵ���߼�����
	}

}
