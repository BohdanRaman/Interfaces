package task_18;

/**
 * Create a Cycle interface, with implementations Unicycle, Bicycle
 * and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
 */

public class Tricycle implements Cycle {
    @Override
    public int countWhiles(int i) {

        return i;
    }

    @Override
    public String WhoCanUseCycle() {
        return "Young people";
    }
}
