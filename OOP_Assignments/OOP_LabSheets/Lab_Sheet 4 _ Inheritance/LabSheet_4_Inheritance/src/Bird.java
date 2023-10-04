class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird(Crow) makes a bird-specific sound(Caws)");
    }

    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}
