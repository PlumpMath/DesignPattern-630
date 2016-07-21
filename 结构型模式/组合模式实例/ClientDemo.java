package 组合模式实例;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CEO
		ConcreteCompany root = new ConcreteCompany("张三", "CEO", 100000);
		// 部门经理
		ConcreteCompany developDep = new ConcreteCompany("李四", "研发部经理", 12000);
		ConcreteCompany salasDep = new ConcreteCompany("王五", "销售部经理", 12000);
		ConcreteCompany financeDep = new ConcreteCompany("马六", "财务部经理", 12000);
		// 部门员工
		Employee e1 = new Employee("A", "研发部", 3000);
		Employee e2 = new Employee("B", "研发部", 2500);
		Employee e3 = new Employee("C", "研发部", 4000);
		Employee e4 = new Employee("D", "研发部", 6000);
		Employee e5 = new Employee("E", "销售部", 3500);
		Employee e6 = new Employee("F", "销售部", 2300);
		Employee e7 = new Employee("G", "销售部", 5000);
		Employee e8 = new Employee("H", "财务部", 3800);
		Employee e9 = new Employee("I", "财务部", 4300);
		// 生成树
		root.add(developDep);
		root.add(salasDep);
		root.add(financeDep);
		developDep.add(e1);
		developDep.add(e2);
		developDep.add(e3);
		developDep.add(e4);
		salasDep.add(e5);
		salasDep.add(e6);
		salasDep.add(e7);
		financeDep.add(e8);
		financeDep.add(e9);
		// 显示公司层次
		System.out.println(root.getInfo());
		display(root);
	}

	// 遍历树（递归）
	public static void display(ConcreteCompany root) {
		// TODO Auto-generated method stub
		for(Company c:root.getChild()){// 如果节点类型是叶子节点
			if(c instanceof Employee){
				System.out.println(c.getInfo());
			}else{// 树枝节点
				System.out.println("\n" + c.getInfo());
				display((ConcreteCompany)c);// 递归调用
			}
		}
	}

}
