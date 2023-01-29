
public class Dog extends Animal implements Land {
    // member

    private int numberOfLegs;
    // constructor

    Dog(boolean carnivoros, boolean mammals, int mood) {
        super(carnivoros, mammals, mood);
        this.numberOfLegs = 4;
    }
    // function that prints how the dog usually says hello

    public void sayHello() {
        if (this.getMood() == this.MOOD_HAPPY) {
            System.out.println("bark loudly");
        }

        else if (this.getMood() == this.MOOD_SCARE) {
            System.out.println("whooping");
        } else {
            System.out.println("wagging their tails");
        }
        
    }
    // function that prints how the dog says hello according to its current mood

    public void sayHello(int mood) {
        this.setMood(mood);
        sayHello();
    }

    // function that returns how many legs the dog has
    public int getNumberOfLogs() {
        return this.numberOfLegs;
    }
}