package com.kevin.simplefactory;

/**
 * @author kevin
 */
public class LineChart  implements Chart{
    public LineChart() {
        System.out.println("创建折线图");
    }

    public void display() {
        System.out.println("显示折线图");
    }
}
