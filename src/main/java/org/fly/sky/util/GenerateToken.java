package org.fly.sky.util;

public class GenerateToken {

    public static String getToken() {
        return "token";
    }

    public static boolean hasToken(String token) {
        return token != null && token.equals("token");
    }

    public static void removeToken() {}

}
