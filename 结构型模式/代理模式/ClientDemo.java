package ����ģʽ;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGamePlayer player = new GamePlayer("����ң");
		IGamePlayer proxy = new GamePlayerProxy(player);
		proxy.killBoss();
		proxy.upGrade();
		player.killBoss();
		player.upGrade();
	}

}
