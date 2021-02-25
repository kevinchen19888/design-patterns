package com.kevin.singleton;

/**
 * 懒汉式(线程非安全)
 * <p>
 * 1.声明一个私有静态成员变量空对象引用
 * 2.私有化构造器
 * 3.提供一个静态的 getInstance 方法
 *
 * @author kevin
 */
public class LazySingleton1 {
    private static LazySingleton1 singleton1;

    public static LazySingleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new LazySingleton1();
        }
        return singleton1;
    }

    private LazySingleton1() {
    }
}
