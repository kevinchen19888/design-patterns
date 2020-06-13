package com.kevin.simplefactory.util;

import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author: kevin
 */
public class ReflectUtil {

    /**
     * 获取接口所有实现
     *
     * @return
     */
    public static List<Class> getImplList(String packageName, Class theInterface) {
        List<Class> configList = new ArrayList<>();
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> classes = reflections.getSubTypesOf(theInterface);
        if (classes != null) {
            for (Class  config : classes) {
                boolean isAbstract = Modifier.isAbstract(config.getModifiers());
                if (!isAbstract) {
                    configList.add(config);
                }
            }
        }
        return configList;
    }

}
