package com.kevin.simplefactory.util;

import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author kevin
 */
public class ReflectUtil {

    /**
     * 获取接口所有实现
     *
     * @param packageName  接口所在的包名
     * @param theInterface 接口的class对象
     */
    public static List<Class> getImplList(String packageName, Class theInterface) {
        List<Class> configList = new ArrayList<>();
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> classes = reflections.getSubTypesOf(theInterface);
        if (classes != null) {
            for (Class config : classes) {
                boolean isAbstract = Modifier.isAbstract(config.getModifiers());
                if (!isAbstract) {
                    configList.add(config);
                }
            }
        }
        return configList;
    }

}
