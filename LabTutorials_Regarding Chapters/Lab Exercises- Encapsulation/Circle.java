public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area of the circle
    public void calculateArea() {
        System.out.println("Area is: "+Math.PI*radius*radius);
    }

    // Calculate perimeter of the circle (circumference)
    public void calculatePerimeter() {
      System.out.println("Perimeter is:" +2*Math.PI*radius);
    }

    
    public static void main(String[]args){
        Circle rad = new Circle(2.5);
         
         rad.calculateArea();
         rad.calculatePerimeter();
}

    
}
