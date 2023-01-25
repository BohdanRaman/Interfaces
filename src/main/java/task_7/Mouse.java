package task_7;

public class Mouse implements Rodent {
    private final int mouseJump = 6;
    private final int mouseEat = 65;
    private final String mouseSay = "mi mi mi";

    @Override
    public String say(String voice) {
        System.out.println("Rodent can: ");
        return voice;
    }

    @Override
    public String eat(int gram) {
        return gram < 50 ? " Eats little" : "Eats a lot";
    }

    @Override
    public int jump(int cm) {
        return getJump(cm);
    }

    @Override
    public int getJump(int rodentJump) {
        if (rodentJump < 0) {
            System.out.println("Rodent can't so jump");
        }
        if (rodentJump > 0 && rodentJump < 5) {
            System.out.println("Rodent has a small jump");
        }
        if (rodentJump >= 5) {
            System.out.println("Rodent has a big jump");
        }
        return rodentJump;
    }

    @Override
    public String toString() {
        return "Mouse: " + "\n"
                + "eat: " + eat(mouseEat) + "\n"
                + "say: " + say(mouseSay) +  "\n"
                + "jump cm: " + jump(mouseJump) + "\n";
    }
}
