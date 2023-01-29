public class Cat extends Animal implements Land {
    // members

    private int numberOfLegs;
    // constructor

    Cat(boolean carnivoros, boolean mammals, int mood) {
        super(carnivoros, mammals, mood);
        this.numberOfLegs = 4;
    }

    // function that prints how the cat usually says hello
    public void sayHello() {
        System.out.println("meow~");
    }
    
    // function that prints how the cat says hello according to its current mood
    public void sayHello(int mood) {
        if (mood == this.MOOD_HAPPY) {
            System.out.println("purr, purr");
        } else if (mood == this.MOOD_SCARE) {
            System.out.println("hiss");
        } else {
            sayHello();
        }
    }

    // function that returns how many legs the cat has
    public int getNumberOfLogs() {
        return this.numberOfLegs;
    }

}
