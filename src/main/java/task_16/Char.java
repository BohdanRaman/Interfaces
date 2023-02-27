package task_16;

import java.util.Scanner;

/**
 * Create a class that produces a sequence of chars. Adapt this class so
 * that it can be an input to a Scanner object.
 */

public class Char {
    private static final char[] CHARS =
            "!@#$%^&*()/?>.<,~`|".toCharArray();

    public static char[] getCHARS() {
            return CHARS;
        }
    }

