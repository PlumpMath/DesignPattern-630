package װ��ģʽʵ��;

// ��������ʵ����ConcreteCarDecorator
public class ConcreteCarDecorator extends CarDecorator{

	public ConcreteCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	// �������вʻ�
	private void print(){
		System.out.println("�ڳ�β���ơ����֡���������ɫ����ɫϼ��");
	}
	
	// ������װGPS�豸
	private void setGps(){
		System.out.println("��װGPS��λ����ϵͳ");
	}
	
	// ��дshow����
	public void show(){
		super.show();
		this.print();
		this.setGps();
	}
}
