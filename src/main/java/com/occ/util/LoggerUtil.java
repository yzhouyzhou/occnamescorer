package com.occ.util;

import java.time.LocalDateTime;

public class LoggerUtil {

    public static void log(String message){
        System.out.println("[" + LocalDateTime.now() + " " + Thread.currentThread().getName() +"] - " + message);
    }    
}
