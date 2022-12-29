package org.fly.sky.util;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class GenerateToken {

    public static String getToken() {
        return "token";
    }

    public static boolean hasToken(String token) {
        return token != null && token.equals("token");
    }

    public static void removeToken() {}

}
