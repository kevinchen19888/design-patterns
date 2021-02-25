package com.kevin.singleton;

/**
 * 懒汉式单例模式(线程安全[伪],同步代码块)
 * <p>
 * 1.声明一个私有静态成员变量空对象引用
 * 2.构造器私有
 * 3.提供一个静态的 getInstance 方法,方法在返回对象时使用同步代码块
 *
 * @author kevin
 */
public class LazySingleton3 {
    private static LazySingleton3 singleton3;

    public static LazySingleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (LazySingleton3.class) {
                singleton3 = new LazySingleton3();
            }
        }
        return singleton3;
    }
}
