package task_16;

import java.nio.CharBuffer;
import java.util.Random;

/**
 * Create a class that produces a sequence of chars. Adapt this class so
 * that it can be an input to a Scanner object.
 */

public class Char implements Readable {
    private static final Random rand = new Random(47);
    private static final char[] CHARS =
            "!@#$%^&*()/?>.<,~`|".toCharArray();
    private int count;

    public Char(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1;
        cb.append(CHARS[rand.nextInt(CHARS.length)]);
        cb.append(" ");
       return 6;
    }
}
