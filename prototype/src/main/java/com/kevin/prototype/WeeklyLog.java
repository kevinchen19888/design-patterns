package com.kevin.prototype;

import lombok.Data;

import java.io.*;
import java.time.LocalDate;

/**
 * 可克隆的周报对象
 * 1,对对象的拷贝实现分为两种:
 * <a,浅拷贝:通过super.clone()实现,只能拷贝原型对象的值(基本)类型变量值,对于引用类型只能拷贝地址;
 * <b,深拷贝:通过序列化技术实现,对于值类型和引用类型都可以实现值得拷贝;
 *
 * @author : kevin
 */
@Data
public class WeeklyLog implements Cloneable,Serializable {
    private String name;
    private String content;
    private LocalDate date;// 对于引用类型无法通过super.clone()实现深拷贝
    private Attachment attachment;// 对于引用类型无法通过super.clone()实现深拷贝

    @Override
    protected WeeklyLog clone() throws CloneNotSupportedException {
        return (WeeklyLog) super.clone(); // 只实现了浅拷贝
    }

    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return (WeeklyLog) ois.readObject();
    }
}
