package 代理模式;
/**
 * GamePlayer实现对IGamePlayer接口中的方法
 * @author zhengtaishuai
 *
 */
public class GamePlayer implements IGamePlayer{
	
	private String name = "";
	
	// 构造函数
	public GamePlayer(String name){
		this.name = name;
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "在打怪！");
	}

	@Override
	public void upGrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "成功升了1级！");
	}
	
}
