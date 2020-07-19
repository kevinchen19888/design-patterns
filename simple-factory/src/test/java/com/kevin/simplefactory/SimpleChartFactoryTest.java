package com.kevin.simplefactory;

import com.kevin.simplefactory.util.FileUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

/**
 * @author kevin
 */
public class SimpleChartFactoryTest {

    /**
     * 简单工厂类的使用
     */
    @Test
    public void testSimpleChartFactory() {
        Chart chart = SimpleChartFactory.getChart("PieChart");
        Assert.assertNotNull("通过工厂创建Chart实例对象失败", chart);
    }

    /**
     * 改进的简单工厂类使用:
     * 使用配置文件来决定客户端具体要实例化的对象类型,可扩展性更好
     *
     * @throws URISyntaxException
     */
    @Test
    public void testModifiedSimpleChartFactory() throws URISyntaxException {
        URL resource = SimpleChartFactory.class.getClassLoader().getResource("config.xml");
        List<String> chartTypes = FileUtil.parseXml(new File(resource.toURI()), "chartType");
        Chart chart = null;
        if (chartTypes != null && chartTypes.size() > 0) {
            String chartType = chartTypes.get(0);
            chart = SimpleChartFactory.getChart(chartType);
        }
        Assert.assertNotNull("通过工厂创建Chart实例对象失败", chart);
    }


}
