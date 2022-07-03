package com.kevin.decorator;

/**
 * 对被装饰者对象进行功能扩展的具体装饰者类
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void addFunction() {
        System.out.println("为具体构件角色进行功能增强的addedFunction()");
    }
}
