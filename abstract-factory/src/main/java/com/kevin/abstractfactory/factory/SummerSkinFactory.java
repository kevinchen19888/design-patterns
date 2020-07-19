package com.kevin.abstractfactory.factory;

import com.kevin.abstractfactory.*;

/**
 * Summer 皮肤工厂: 具体工厂
 *
 * @author kevin
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
