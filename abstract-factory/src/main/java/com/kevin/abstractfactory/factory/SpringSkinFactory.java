package com.kevin.abstractfactory.factory;

import com.kevin.abstractfactory.*;

/**
 * Spring 皮肤工厂: 具体工厂
 *
 * @author kevin
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
