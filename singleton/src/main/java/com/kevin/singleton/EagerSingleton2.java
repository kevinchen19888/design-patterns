package com.kevin.singleton;

/**
 * 饿汉模式(静态代码块)
 * step:
 * 1.构造私有
 * 2.声明一个私有的类的静态成员变量并通过静态代码块初始化
 * 3.提供一个返回类的实例的 getInstance 方法
 *
 * @author kevin
 */
public class EagerSingleton2 {
    private static EagerSingleton2 eagerSingleton2;

    {
        eagerSingleton2 = new EagerSingleton2();
    }

    public static EagerSingleton2 getInstance() {
        return eagerSingleton2;
    }

    private EagerSingleton2() {
    }
}
