package com.example.demo.util.validator;

import com.example.demo.model.util.Label;

import java.util.regex.Pattern;

public final  class Validator {
    public static boolean checkPhone(final String phone, String regExp) {
        return Pattern.compile(regExp).matcher(phone).matches();
    }

    public static boolean checkEmail(final String email, String regExp) {
        return Pattern.compile(regExp).matcher(email).matches();
    }

    public static boolean checkLabel(final Label value, Label[] label) {
        for (int i = 0; i < label.length; i++) {
            if (label[i] == value) return true;
        }
        return false;
    }
}


