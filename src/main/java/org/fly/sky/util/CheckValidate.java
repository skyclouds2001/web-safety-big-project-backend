package org.fly.sky.util;

import java.util.regex.Pattern;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
public class CheckValidate {

    private CheckValidate() {}

    public static boolean isValidatePhone(String phone) {
        return Pattern.matches("^1[3-9]\\d{9}$", phone);
    }

    public static boolean isValidateEmail(String email) {
        return Pattern.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+", email);
    }

    public static boolean isValidatePassword(String password) {
        return Pattern.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$", password);
    }

}
