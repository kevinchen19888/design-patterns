package com.kevin.simplefactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: kevin
 */
public class ConfigurableChartFactoryTest {

    @Test
    public void testChartFactory() {
        ConfigurableChartFactory factory = new ConfigurableChartFactory();
        Chart chart = factory.getChartByXml();
        Assert.assertNotNull("通过工厂创建Chart实例对象失败", chart);
    }


}
