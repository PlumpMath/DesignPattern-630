package װ��ģʽ;

// װ��Decorator��
// ������
public abstract class Decorator implements Component { 
	private Component component = null; // ʵ�������󹹼���
	public Decorator(Component component){
		this.component = component;
	}
	public void operation(){
		this.component.operation();
	}
}
