package com.kevin.singleton;

/**
 * 基于静态内部类实现的单例模式
 * 相较DCL方式和饿汉方式更好:没有进行同步控制,实现了懒加载
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
