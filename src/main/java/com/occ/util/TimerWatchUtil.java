package com.occ.util;

import static java.lang.Thread.sleep;

import org.springframework.util.StopWatch;

public class TimerWatchUtil {

    public static StopWatch stopWatch = new StopWatch();

    public static void delay(long delayMilliSeconds)  {
        try{
            sleep(delayMilliSeconds);
        }catch (Exception e){
            LoggerUtil.log("Exception is :" + e.getMessage());
        }
    }

    public static String transForm(String s) {
        TimerWatchUtil.delay(500);
        return s.toUpperCase();
    }

    public static void startTimer(){
        stopWatch.start();
    }

    public static void timeTaken(){
        stopWatch.stop();
        LoggerUtil.log("Total Time Taken (in secs) : " + stopWatch.getTotalTimeSeconds());
    }

    public static void stopWatchReset(){
//        stopWatch.reset();
    }

    public static  int noOfCores(){
        return Runtime.getRuntime().availableProcessors();
    }
}
