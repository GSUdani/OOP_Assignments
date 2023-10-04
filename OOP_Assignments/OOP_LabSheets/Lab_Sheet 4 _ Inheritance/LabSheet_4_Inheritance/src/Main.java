public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Squirrel", 5);
        Mammal mammal = new Mammal("Cat", 3, "Brown");
        Bird bird = new Bird("Kiwi", 2, 20.5);
        Dog dog = new Dog("Tutu", 4, "Black", "Labrador");

        animal.makeSound();
        mammal.makeSound();
        bird.makeSound();
        dog.makeSound();

        System.out.println("Animal: " + animal.toString());
        System.out.println("Mammal: " + mammal.toString());
        System.out.println("Bird: " + bird.toString());
        System.out.println("Dog: " + dog.toString());
    }
}
