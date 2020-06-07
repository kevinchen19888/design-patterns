package com.kevin;

/**
 * 使用双重检查锁的懒汉单例模式
 * step:
 * 1,构造器私有;
 * 2,提供静态私有成员变量,初始值为null; 注意要使用修饰符volatile,保证多线程环境下的可见性
 * 3,提供静态的getInstance方法,具体方法实现参照代码;
 */
public class DCLLazySingleton {
    private volatile static DCLLazySingleton singleton = null;

    public static DCLLazySingleton getInstance() {
        // 第一次判断
        if (singleton == null) {
            // 锁定代码块,进行并发控制
            synchronized (DCLLazySingleton.class) {
                // 第二次判断
                if (singleton == null) {
                    return new DCLLazySingleton();
                }
            }
        }
        return singleton;
    }

    private DCLLazySingleton() {
    }

}
