public class Main {
    public static void main(String[] args) {

        Circle cir = new Circle();
        System.out.println("Circle:" +cir.toString());
        System.out.println("Area: " + cir.getArea());
        System.out.println("Perimeter: " + cir.getPerimeter());


        Rectangle rec = new Rectangle();
        System.out.println("\nRectangle:" +rec.toString());
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());


        Square squ = new Square();
        System.out.println("\nSquare:" +squ.toString());
        System.out.println("Area: " + squ.getArea());
        System.out.println("Perimeter: " + squ.getPerimeter());
    }
}


