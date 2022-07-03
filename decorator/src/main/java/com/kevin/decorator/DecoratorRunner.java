package com.kevin.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 原始逻辑
        component.operation();
        System.out.println("------------------>");
        // 进行装饰增强
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
