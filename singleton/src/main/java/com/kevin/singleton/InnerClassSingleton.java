package com.kevin.singleton;

/**
 * 基于静态内部类实现的单例模式
 * 相较DCL方式和饿汉方式更好:没有进行同步控制,实现了懒加载
 * <p>
 * 实现原理:
 * 当类加载的时候,其静态内部类没有被加载,即只有使用到的时候才会被加载,且加载的时候是线程安全的
 */
public class InnerClassSingleton {

    private static class HolderClass {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return HolderClass.INSTANCE;
    }

    private InnerClassSingleton() {
    }
}
