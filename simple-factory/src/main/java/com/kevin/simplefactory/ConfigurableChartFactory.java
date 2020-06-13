package com.kevin.simplefactory;

import com.kevin.simplefactory.util.FileUtil;
import com.kevin.simplefactory.util.ReflectUtil;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Optional;

/**
 * 可配置的图表工厂类
 * 通过xml配置来决定实体实例化的类型,当实现类发生改变时,
 * 无需修改任何源码,可维护性更好
 *
 * @Author: kevin
 */
public class ConfigurableChartFactory {

    public Chart getChartByXml() {
        try {
            URL resource = this.getClass().getClassLoader().getResource("config.xml");
            List<String> chartTypes = FileUtil.parseXml(new File(resource.toURI()), "chartType");
            if (chartTypes != null && chartTypes.size() > 0) {
                String chartType = chartTypes.get(0);
                List<Class> configList = ReflectUtil.getImplList("com.kevin", Chart.class);
                Optional<Class> aClass = configList.stream().filter(c -> c.getSimpleName().equalsIgnoreCase(chartType)).findFirst();
                return (Chart) aClass.get().newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
