package com.kevin.builder;

import lombok.ToString;

/**
 * 角色类
 *
 * @author kevin
 */
@ToString
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String hairStyle;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }
}
