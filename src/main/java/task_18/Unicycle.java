package task_18;
/**
 * Create a Cycle interface, with implementations Unicycle, Bicycle
 * and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
 */

public class Unicycle implements Cycle{
    @Override
    public void countWhiles() {
    }

    @Override
    public String WhoCanUseCycle() {
        return "Boy and Girl";
    }
}