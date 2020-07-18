package com.kevin.abstractfactory.factory;

import com.kevin.abstractfactory.Button;
import com.kevin.abstractfactory.ComboBox;
import com.kevin.abstractfactory.TextField;

/**
 * 界面皮肤工厂接口:抽象工厂
 *
 * @Author: kevin
 */
public interface SkinFactory {
    Button createButton();

    TextField createTextFiled();

    ComboBox createComboBox();
}
