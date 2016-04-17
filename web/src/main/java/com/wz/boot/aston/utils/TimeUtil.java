package com.wz.boot.aston.utils;


import java.util.concurrent.TimeUnit;

/**
 * @author wenzeng
 * @since 1.0
 */
public final class TimeUtil {

    private TimeUtil() {}

    /**
     * @return get current time seconds use {@link TimeUnit}.MILLISECONDS.toSeconds
     */
    public static long currentTimeSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /**
     * @return get current time seconds simply
     */
    public static long currentTimeSecs() {
        return (System.currentTimeMillis() / 1000);
    }
}
