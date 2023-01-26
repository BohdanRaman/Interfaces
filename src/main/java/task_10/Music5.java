package task_10;

/**
 * Exercise 10: Modify Musics.java by adding a Playable interface. Move the play( )
 * declaration from Instrument to Playable. Add Playable to the derived classes by
 * including it in the implement s list. Change tune( ) so that it takes a Playable instead of
 * an Instrument.
 */
interface Playable extends Instrument{      //Inherit interface Instrument and overridden his method
    @Override
    void play(Note n);

    @Override
    void adjust();
}

interface Instrument {
    int VALUE = 5;

    void play(Note n);

    void adjust();
}

// I replaced interface Instrument on interface Playable
class Wind implements Playable{
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Playable{
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
        //In result will be the same. I'm not sure in correct work.
    }
}
