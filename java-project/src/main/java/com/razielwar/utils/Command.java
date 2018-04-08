package com.razielwar.utils;

public class Command {
    public static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    public static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }
}
