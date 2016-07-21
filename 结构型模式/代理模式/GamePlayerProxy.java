package ����ģʽ;

import java.util.Date;

/**
 * GamePlayerProxy�Ǵ�����
 * ������log()��count()����˽�з������ֱ�����������ʱ���������ʱ
 * @author zhengtaishuai
 *
 */
public class GamePlayerProxy implements IGamePlayer{
	
	private IGamePlayer player = null;
	public GamePlayerProxy(IGamePlayer player){
		this.player = player;
	}
	
	//��¼���ʱ��
	private void log(){
		System.out.println("���ʱ��" + new Date().toString());
	}
	
	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.log();
		player.killBoss();
		
	}

	@Override
	public void upGrade() {
		// TODO Auto-generated method stub
		player.upGrade();
		this.count();
	}
	
	//�����������õ�ʱ��
	private void count(){
		System.out.println("��1���ķ�50Сʱ");
	}
}
