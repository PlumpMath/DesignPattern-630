package ����ģʽ;
/**
 * GamePlayerʵ�ֶ�IGamePlayer�ӿ��еķ���
 * @author zhengtaishuai
 *
 */
public class GamePlayer implements IGamePlayer{
	
	private String name = "";
	
	// ���캯��
	public GamePlayer(String name){
		this.name = name;
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "�ڴ�֣�");
	}

	@Override
	public void upGrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "�ɹ�����1����");
	}
	
}
