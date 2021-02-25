package com.kevin.singleton;

/**
 * 饿汉单例模式(静态常量)
 * step:
 * 1,构造器私有化;
 * 2,提供静态私有的单实例成员变量;
 * 3,提供统一的静态getInstance方法;
 * <br/>
 * 优缺点:
 * 优点.写法简单,线程安全
 * 缺点.在类加载时就完成了实例化,如果始终没有用的对象实例的话,造成内存浪费
 */
public class EagerSingleton1 {
    private static final EagerSingleton1 singleton = new EagerSingleton1();

    public static EagerSingleton1 getInstance() {
        return singleton;
    }

    private EagerSingleton1() {
    }
}
