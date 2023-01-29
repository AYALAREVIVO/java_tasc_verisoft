public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = { new Cat(true, true, 1), new Dog(true, true, 2), new Frog(false, false, 2) };
        for (Animal animal : animals) {
            System.out.println("the " + animal.getClass().getName() + " say hello:");
            animal.sayHello();
            System.out.println("Is the " + animal.getClass().getName() + " a mammal?");
            System.out.println(animal.isMammals());
            System.out.println("Is the " + animal.getClass().getName() + " a cnivoros?");
            System.out.println(animal.isCarnivoros());
            if (animal instanceof Land) {
                Land c = (Land) animal;
                System.out.println("How many legs does a  " + animal.getClass().getName() + " have?");
                System.out.println(c.getNumberOfLogs());
            }
            if (animal instanceof Water) {
                Water c = (Water) animal;
                System.out.println("Can a " + animal.getClass().getName() + " lay eggs?");
                System.out.println(c.hasLaysEggs());
                System.out.println("Does a " + animal.getClass().getName() + " have gills?");
                System.out.println(c.hesGills());
            }

        }

    }
}
