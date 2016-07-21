/**
 * 桥梁模式（Bridge Pattern）也称桥接模式，是一种简单的、不常使用的设计模式。
 * 桥梁模式的定义：Decouple an abstraction from its implementation so that the two can vary independetly.
 * 意思是：将抽象和实现解耦，使得两者可以独立地变化。
 * 
 * 桥梁模式有以下4个角色：
 * 	（1）抽象化（Abstraction）角色：该角色抽象化的给出定义，并保存一个对实现化对象的引用。
 * 	（2）实现化（Implementor）角色：该角色给出实现化角色的接口，但不给出具体的实现。
 * 	（3）修正抽象化（RefinefAbstraction）角色：该角色扩展抽象化角色，它引用实现化角色并
 * 		对抽象化角色进行修正。
 * 	（4）具体实现化（ConcreteImplementor）角色：该角色对实现化角色接口中的方法进行具体实现。
 * 
 * 桥梁模式的优点：
 * 	（1）抽象和实现分离是桥梁模式的主要特点，是为了解决继承的缺点而提出的设计模式。在该模式下，
 * 		实现可以不受抽象的约束，不用绑定在一个固定的抽象层次上。
 * 	（2）实现对客户透明，客户端不用关心细节的实现，它已经由抽象层通过聚合关系完成了封装。
 * 	（3）提高灵活性和扩展性。
 * 
 * 桥梁模式的适用场合：
 * 	（1）如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的联系。
 * 	（2）设计要求实现化角色的任何改变不应当影响客户端，或者说实现化角色的改变对客户端是完全透明的。
 * 	（3）一个构件有多于一个抽象化的角色和实现化角色，系统需要它们之间进行动态耦合。不希望或不合适使用继承的场合。
 * 		继承具有强侵入性质，即父类有的方法，子类必须有；而桥梁模式是弱关联关系。因此对于比较明确不发生变化的，则
 * 		可以通过继承完成；若不能确定是否会发生变化，则通过桥梁模式来解决。
 */
/**
 * @author zhengtaishuai
 *
 */
package 桥梁模式;