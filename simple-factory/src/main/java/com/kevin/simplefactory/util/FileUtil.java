package com.kevin.simplefactory.util;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: kevin
 */
public class FileUtil {

    /**
     * 解析xml,获取所有的属性值
     *
     * @param file           xml文件
     * @param elementTagName 属性
     * @return 配置的不同的属性值得集合
     */
    public static List<String> parseXml(File file, String... elementTagName) {
        if (Objects.isNull(file) || !file.exists()) {
            throw new IllegalArgumentException("文件不存在");
        }
        List<String> values = null;
        try {
            if (elementTagName != null && elementTagName.length > 0) {
                values = new ArrayList<>();
                DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = builderFactory.newDocumentBuilder();
                Document document = builder.parse(file);
                for (String tag : elementTagName) {
                    NodeList nodeList = document.getElementsByTagName(tag);
                    String value = nodeList.item(0).getFirstChild().getNodeValue().trim();
                    values.add(value);
                }
            }
            return values;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return values;
    }

}
