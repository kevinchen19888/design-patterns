package com.kevin.decorator;

/**
 * 具体构建角色(被装饰类)
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("具体构件角色的方法operation()");
    }
}
