package task_7;


public class Gerbil extends Mouse {
    private final int gerbilJump = 2;
    private final int gerbilEat = 2;
    private final String gerbilSay = "po p po";

    @Override
    public String toString() {
        return "Gerbil: " + "\n"
                + "eat: " + eat(gerbilEat)+ "\n"
                + "say: " + say(gerbilSay)+ "\n"
                + "jump cm: " + jump(gerbilJump)+ "\n";
    }
}
