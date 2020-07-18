package com.kevin.prototype;

import org.junit.Assert;

import java.io.IOException;
import java.time.LocalDate;

/**
 * 客户端模拟
 *
 * @Author: kevin
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setName("kevin");
        weeklyLog.setContent("周报");
        weeklyLog.setDate(LocalDate.now());
        Attachment attachment = new Attachment();
        attachment.setName("weekly log attachment");
        weeklyLog.setAttachment(attachment);
        WeeklyLog cloneWeeklyLog = weeklyLog.clone();

        Assert.assertEquals(cloneWeeklyLog, weeklyLog);

        //System.out.println(cloneWeeklyLog);
        //System.out.println(cloneWeeklyLog.getDate() == weeklyLog.getDate()); // 浅拷贝
        System.out.println(weeklyLog.getAttachment()==cloneWeeklyLog.getAttachment());
        System.out.println(weeklyLog.getContent()==cloneWeeklyLog.getContent());

        //  ==================== 深拷贝
        WeeklyLog deepCloneLog = weeklyLog.deepClone();
        System.out.println(deepCloneLog);
        System.out.println(deepCloneLog.getDate()==weeklyLog.getDate());
        System.out.println(deepCloneLog.getAttachment()==weeklyLog.getAttachment());
        System.out.println(deepCloneLog.getContent()==weeklyLog.getContent());
    }

}
