package 适配器模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 适配器模式
		Target target = new Adapter();
		target.request();
	}

}
