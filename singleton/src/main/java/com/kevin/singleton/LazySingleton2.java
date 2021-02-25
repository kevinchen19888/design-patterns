package com.kevin.singleton;

/**
 * 懒汉式单例模式(线程安全,同步方法)
 * <p>
 * 1.声明一个私有静态成员变量空对象引用
 * 2.构造器私有
 * 3.提供一个静态同步的 getInstance 方法
 *
 * @author kevin
 */
public class LazySingleton2 {
    private static LazySingleton2 singleton2;

    public static synchronized LazySingleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new LazySingleton2();
        }
        return singleton2;
    }

    private LazySingleton2() {
    }
}
