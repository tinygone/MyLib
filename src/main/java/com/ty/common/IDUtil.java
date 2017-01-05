package com.ty.common;

import java.util.UUID;

public class IDUtil {
    
    public static String generateUUID()
    {
        String randomUUID = UUID.randomUUID().toString();
        return randomUUID.replaceAll("-", "");
    }

}
