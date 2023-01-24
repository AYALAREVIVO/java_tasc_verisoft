


public class Cat extends Animal implements Land{
    
   private int numberOfLegs;
    Cat(boolean carnivoros,boolean mammals,int mood){
        super(carnivoros, mammals, mood);
        this.numberOfLegs=4;
    }
    public  void sayHello(){
        System.out.println("meow~");
    }
    public  void sayHello(int mood){
        if(mood==this.MOOD_HAPPY){
            System.out.println("purr, purr");
        }
        else if(mood==this.MOOD_SCARE){
            System.out.println("hiss" );
        }
        else {
            sayHello();
        }
    }
    public int getNumberOfLogs(){
        return this.numberOfLegs;
    }
   
}
