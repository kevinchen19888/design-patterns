package com.keivn.abstractfactory;

import com.kevin.abstractfactory.util.FileUtil;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * @Author: kevin
 */
public class AbstractFactoryTest {

    /**
     * 测试通过配置获取具体的工厂bean
     *
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Test
    public void testGetAbstractFactoryBean() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        List<String> className = FileUtil.parseXml(new File("D:\\Files\\workSpace\\design-patterns\\abstract-factory\\src\\main\\resources\\config.xml"), "className");
        Class<?> factoryBean = Class.forName(className.get(0));
        Object o = factoryBean.newInstance();
        System.out.println(o);
    }
}
