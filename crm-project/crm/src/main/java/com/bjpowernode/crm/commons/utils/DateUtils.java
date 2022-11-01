package com.bjpowernode.crm.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //获取年月日时分秒格式的日期字符串
    public static String formatDataTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }

    //获取年月日格式的日期字符串
    public static String formatData(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        String dateStr = sdf.format(date);
        return dateStr;
    }

    //获取时分秒格式的日期字符串
    public static String formatTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(" HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }
}
