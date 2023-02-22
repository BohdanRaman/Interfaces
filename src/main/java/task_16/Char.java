package task_16;

import java.util.Random;

/**
 * Create a class that produces a sequence of chars. Adapt this class so
 * that it can be an input to a Scanner object.
 */

public class Char {
    private static final char[] CHARS =
            "!@#$%^&*()/?>.<,~`|".toCharArray();
    private static final Random rand = new Random(CHARS.length);

    public double next(Random c) {
        return rand.nextInt(CHARS.length);
    }

    public static void main(String[] args) {
        Char rd = new Char();
        for (int i = 0; i < 7; i++)
            System.out.print(rd.next(rand) + " ");

  /*  public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1;
        cb.append(CHARS[rand.nextInt(CHARS.length)]);
        cb.append(" ");
        return 6;
    }

   */

 /*   public void getRead() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(CHARS.length);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  */
    }
}
