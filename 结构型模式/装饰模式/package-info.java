/**
 * 装饰模式：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成子类更加灵活
 * 装饰模式有以下4个角色：
 * 	（1）抽象构件（Component）角色：该角色用于规范需要装饰的对象（原始对象）。
 * 	（2）具体构件（Concrete Component）角色：该角色实现抽象构件接口，定义一个需要装饰的原始类
 * 	（3）装饰（Decorator）角色：该角色持有一个构件对象的实例，并定义一个与抽象构件接口一致的接口
 * 	（4）具体装饰（Concrete Decorator）角色：该角色负责对构件对象进行装饰。
 * 优点：
 * 	（1）装饰类和被装饰类可以独立发展，而不会相互耦合。即Component类无需知道Decorator类，
 * 		Decorator类是从外部拓展Component类的功能，而Decorator也不用知道具体的构件。
 * 	（2）装饰模式是继承关系的一种替代方案。装饰类Decorator，不管装饰多少层，返回的对象还是Component。
 * 	（3）装饰模式可以动态地拓展一个实现类的功能。
 * 缺点：
 * 	（1）多层的装饰是比较复杂的。
 * 使用场景：
 * 	（1）需要扩展一个类的功能，或给一个类增加附加功能。
 * 	（2）需要动态地给一个对象增加功能，这些功能可以再动态地撤销。
 * 	（3）需要为一批类进行改装或加装功能。
 * 装饰模式可以代替继承，解决类膨胀的问题。
 */
/**
 * @author zhengtaishuai
 * 2015年11月25日22:49:20
 *
 */
package 装饰模式;