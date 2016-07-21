package 代理模式;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGamePlayer player = new GamePlayer("李逍遥");
		IGamePlayer proxy = new GamePlayerProxy(player);
		proxy.killBoss();
		proxy.upGrade();
		player.killBoss();
		player.upGrade();
	}

}
