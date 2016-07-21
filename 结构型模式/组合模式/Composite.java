package 组合模式;

import java.util.ArrayList;

// 定义树枝构件
public class Composite implements Component{

	// 构件容器
	private ArrayList<Component> componentList = new ArrayList<Component>();
	
	// 添加构件
	public void add(Component component){
		this.componentList.add(component);
	}
	
	// 删除构件
	public void remove(Component component){
		this.componentList.remove(component);
	}
	
	// 获取子构件
	public ArrayList<Component> getChild(){
		return this.componentList;
		
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		// 业务逻辑代码
	}

}
