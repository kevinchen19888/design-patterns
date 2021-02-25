package com.kevin.singleton;

/**
 * 基于双重检查锁的单例模式
 * <p>
 * 1.声明一个volatile 类型的静态成员变量对象引用
 * 2.提供一个 getInstance 方法(基于DCL实现)
 * 3.构造器私有化
 * <p>
 * 优点:
 * 既解决了线程安全问题,同时保证了效率(懒加载)
 *
 * @author kevin
 */
public class DCLSingleton {
    private static volatile DCLSingleton singleton;

    public static DCLSingleton getInstance() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }

    private DCLSingleton() {
    }
}
