package com.razielwar.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Command {
    public static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    public static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

    // check if a string exists in a text file
    public static boolean existsInFile(String str, String fileName) throws FileNotFoundException {
        try {
            return Files.lines(Paths.get(fileName)).anyMatch(line -> line.contains(str));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
