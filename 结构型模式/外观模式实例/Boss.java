package 外观模式实例;

public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secretary s = new Secretary();
		System.out.println("老板告诉秘书要到上海出差10天");
		s.trip("上海", 10);
		System.out.println("+++++++++++++++");
		System.out.println("老板告诉秘书邀请8个人吃饭");
		s.repast(8);
	}

}
