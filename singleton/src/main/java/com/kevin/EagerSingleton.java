package com.kevin;

/**
 * 饿汉单例模式(线程安全)
 * step:
 * 1,构造器私有化;
 * 2,提供静态私有的单实例成员变量;
 * 3,提供统一的静态getInstance方法;
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return singleton;
    }

    private EagerSingleton() {
    }
}
