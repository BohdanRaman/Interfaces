package task_18;

/**
 * Create a Cycle interface, with implementations Unicycle, Bicycle
 * and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
 */

public class BaseClass {
    public BaseClass() {
    }

    public Cycle getDetail(CycleType cycleType) {
        if (cycleType == null) {
            throw new IllegalArgumentException("Unknown detail");
        }
        return switch (cycleType) {
            case UNICYCLE -> new Unicycle();
            case BICYCLE -> new Bicycle();
            case TRICYCLE -> new Tricycle();
        };
    }
}
