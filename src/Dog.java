
public class Dog extends Animal implements Land{
    private int numberOfLegs;
    Dog(boolean carnivoros,boolean mammals,int mood){
        super(carnivoros, mammals, mood);
        this.numberOfLegs=4;
    }
    public  void sayHello(){
        System.out.println("wagging their tails");
    }
    public  void sayHello(int mood){
        if(mood==this.MOOD_HAPPY){
            System.out.println("bark loudly");
        }
       
        else if(mood==this.MOOD_SCARE){
            System.out.println("whooping" );
        }
        else {
            sayHello();
        }
    }
    public int getNumberOfLogs(){
        return this.numberOfLegs;
    }
 }