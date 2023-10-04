public class Main{
    public static void main(String[]args){
        Dog myDog = new Dog("tutu");

        System.out.println("My dog name is " +myDog.name);


        myDog.makeSound();
        myDog.bark();

    }
}
