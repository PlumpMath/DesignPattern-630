package 代理模式;

import java.util.Date;

/**
 * GamePlayerProxy是代理类
 * 定义了log()和count()两个私有方法，分别用于输出打怪时间和升级耗时
 * @author zhengtaishuai
 *
 */
public class GamePlayerProxy implements IGamePlayer{
	
	private IGamePlayer player = null;
	public GamePlayerProxy(IGamePlayer player){
		this.player = player;
	}
	
	//记录打怪时间
	private void log(){
		System.out.println("打怪时间" + new Date().toString());
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
	
	//计算升级所用的时间
	private void count(){
		System.out.println("升1级耗费50小时");
	}
}
