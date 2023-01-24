
public class Frog extends Animal implements Water, Land {
    private int numberOfLegs;

    Frog(boolean carnivoros, boolean mammals, int mood) {
        super(carnivoros, mammals, mood);
        this.numberOfLegs = 4;
    }

    public void sayHello(int mood) {
        if (mood == this.MOOD_HAPPY) {
            System.out.println("quack quack quack");
        } else if (mood == this.MOOD_SCARE) {
            System.out.println("plop into the water");
        }
    }

    public int getNumberOfLogs() {
        return this.numberOfLegs;
    }

    public boolean hesGills() {
        return true;
    }

    public boolean hasLaysEggs() {
        return true;
    }

}
