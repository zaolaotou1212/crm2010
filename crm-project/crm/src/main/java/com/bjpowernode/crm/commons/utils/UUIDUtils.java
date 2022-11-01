package com.bjpowernode.crm.commons.utils;

import java.util.UUID;

public class UUIDUtils {
    public static String getUUID(){
       String str =  UUID.randomUUID().toString().replaceAll("-", "");
       return  str;
    }
}
