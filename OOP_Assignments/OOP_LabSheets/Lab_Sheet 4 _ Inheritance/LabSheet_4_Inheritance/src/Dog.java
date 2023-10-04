class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes a dog-specific sound(woof woof)");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
