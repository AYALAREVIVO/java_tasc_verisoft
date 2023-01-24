
public class Frog extends Animal implements Water, Land {
    // member

    private int numberOfLegs;
    // constructor

    Frog(boolean carnivoros, boolean mammals, int mood) {
        super(carnivoros, mammals, mood);
        this.numberOfLegs = 4;
    }
    // function that prints how the dog says hello according to its current mood

    public void sayHello(int mood) {
        if (mood == this.MOOD_HAPPY) {
            System.out.println("quack quack quack");
        } else if (mood == this.MOOD_SCARE) {
            System.out.println("plop into the water");
        }
    }
    // function that returns how many legs the dog has

    public int getNumberOfLogs() {
        return this.numberOfLegs;
    }

    // function that returns whether the frog has gills
    public boolean hesGills() {
        return true;
    }

    // function that returns whether the frog can lay eggs
    public boolean hasLaysEggs() {
        return true;
    }

}
