package com.kevin.simplefactory;

/**
 * 简单图表工厂类
 *
 * @Author: kevin
 */
public class SimpleChartFactory {

    public static Chart getChart(String type) {
        if ("HistogramChart".equalsIgnoreCase(type)) {
            return new HistogramChart();
        }
        if ("PieChart".equalsIgnoreCase(type)) {
            return new PieChart();
        }
        if ("LineChart".equalsIgnoreCase(type)) {
            return new LineChart();
        }
        return null;
    }
}
