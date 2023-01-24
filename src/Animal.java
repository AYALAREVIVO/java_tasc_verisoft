
//abstract Animal class
abstract class Animal {
    // members
    private boolean carnivoros;
    private boolean mammals;
    public final int MOOD_HAPPY = 1;
    public final int MOOD_SCARE = 2;
    private int mood;

    // constructor
    Animal(boolean carnivoros, boolean mammals, int mood) {
        setCarnivoros(carnivoros);
        setMammals(mammals);
        this.mood = mood;
    }

    public void sayHello() {
    }

    // declare on method
    public abstract void sayHello(int mood);

    // Get and Set functions
    public boolean isMammals() {
        return this.mammals;
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    public boolean isCarnivoros() {
        return this.carnivoros;
    }

    public void setCarnivoros(boolean carnivoros) {
        this.carnivoros = carnivoros;
    }

}
