/**
 * 外观模式（Facade Pattern）也叫门面模式，是一种比较常用也非常简单的设计模式。
 * 外观模式的英文原话是：
 * 	Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface
 * 	that makes the subsystem easier to use.
 * 	意思是：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。外观模式提供一个高层次的接口，使得子系统更易使用。
 * 	外观模式注重“统一的对象”，即提供一个访问子系统的接口，只有通过该接口（Facade）才能允许访问子系统的行为发生。
 * 	
 *	外观模式具有以下两个角色：
 *	（1）外观（Facade）角色：客户端可以调用该角色方法，该角色知晓相关子系统的功能和职责。正常情况下，本角色会将所有从客户端发来的请求
 *						委派到相应的子系统，即该角色没有实际的业务逻辑，只是一个委托类。
 *	（2）子系统（Subsystem）角色：可以同时有一个或多个子系统，每一个子系统都不是一个单独的类，而是一个类的集合。子系统不知道外观角色
 *						的存在，对于子系统而言，外观角色仅仅是另外一个客户端而已。
 *
 *	外观模式的优点：
 *	（1）减少系统的相互依赖，所有的依赖都是对Facade对象的依赖，与子系统无关。
 *	（2）提高灵活性，不管子系统内部如何变化，只要不影响Facade对象，任何活动都是自由的。
 *	（3）提高安全性，Facade中未提供的方法，外界就无法访问，提高系统的安全性。
 *	外观模式最大的缺点是不符合开闭原则，对修改关闭，对扩展开放。
 *
 *	外观模式的使用场景：
 *	（1）为一个复杂的模块或者子系统提供一个供外界访问的接口。
 *	（2）子系统相对独立，外界对子系统的访问只要黑箱操作即可。
 *	（3）预防风险扩散，使用Facade进行访问操作控制。
 */
/**
 * @author zhengtaishuai
 *
 */
package 外观模式;