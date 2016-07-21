/**
 * 适配器模式的定义：
 * 	Convert the interface of a class into another interface clients expect. Adapter lets classes
 * 	work together that couldn't otherwise because of incompatible interfaces.
 * 	意思是：将一个类的接口变换成客户端所期待的另一种接口，
 * 			从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 * 适配器模式的3个角色：
 * 	（1）目标（Target）角色：该角色定义要转换成的目标接口。
 * 	（2）源（Adaptee）角色：需要被转换成目标角色的源角色。
 * 	（3）适配器（Adapter）角色：该角色是适配器模式的核心，其职责是通过继承或是类关联的方式，将源角色转换为目标角色。
 * 适配器模式的优点：
 * 	（1）适配器可以让两个没有任何关系的类在一起运行。
 * 	（2）增加了类的透明性。
 * 	（3）提高类的复用性。
 * 	（4）增强代码的灵活性。
 * 适配器模式的使用场景：
 * 		修改一个已经投产中的系统时，需要对系统进行拓展，此时使用一个已有的类，但这个类不符合系统中的接口，
 * 		这时使用适配器模式是最合适的，它可以将不符合系统接口的类进行转换，转换成符合系统接口的、可以使用的类。
 */
/**
 * @author zhengtaishuai
 *
 */
package 适配器模式;