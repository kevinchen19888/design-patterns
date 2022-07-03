package com.kevin.decorator;

/**
 * 装饰者顶层抽象类(此类非必要,具体装饰者可直接实现 Component)
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
