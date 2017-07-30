package com.example.shivam.simpleway.data;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by shivam on 12/7/17.
 */

public abstract class GlobalData {

    private GlobalData() {
    };

    private static final AtomicBoolean phoneInMotion = new AtomicBoolean(false);

    public static boolean isPhoneInMotion() {
        return phoneInMotion.get();
    }

    public static void setPhoneInMotion(boolean bool) {
        phoneInMotion.set(bool);
    }
}