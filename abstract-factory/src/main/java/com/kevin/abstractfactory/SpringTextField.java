package com.kevin.abstractfactory;

/**
 * @Author: kevin
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示SpringTextField文本框");
    }
}
