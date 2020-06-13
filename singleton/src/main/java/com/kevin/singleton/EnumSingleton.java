package com.kevin.singleton;

/**
 * 基于枚举实现的单例模式
 * 单元素的枚举类型已经成为实现Singleton的最佳方法 --出自《effective java》
 */
public enum EnumSingleton {
    INSTANCE;

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
    }


}
