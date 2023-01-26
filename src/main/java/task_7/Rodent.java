package task_7;

/**
 * Exercise 9: Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
 * etc. In the base class, provide methods that are common to all Rodents, and override these
 * in the derived classes to perform different behaviors depending on the specific type of
 * Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
 * your base-class methods to see what happens.
 * <p>
 * Exercise 7: Change Exercise 9 in the Polymorphism chapter so that Rodent is an
 * interface.
 */


public interface Rodent {
    String say(String voice);

    String eat(int gram);

    int jump(int cm);

    int getJump(int rodentJump);
}
