public class Car {
    private String carNumber;
    private String modelName;
    private String chassisNumber;
    private double mileage;

    public Car(String carNo, String modelName, String chassisNo, double mileage) {
        this.carNumber = carNo;
        this.modelName = modelName;
        this.chassisNumber = chassisNo;
        this.mileage = mileage;
    }

    
    public String getCarNumber() {
        return carNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public double getMileage() {
        return mileage;
    }

    
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public void setMileage(double mileage){
        this.mileage=mileage;
    }

    public static void main(String[] args) {
        Car myCar = new Car("ABC123", "Toyota", "123456789", 25.5);

        // Get and print car information
        System.out.println("Car Number: " +myCar.getCarNumber());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Chassis Number: " + myCar.getChassisNumber());
        System.out.println("Mileage: " + myCar.getMileage());

        // Update car information
        myCar.setCarNumber("ASD1234");
        myCar.setModelName("Honda");
        myCar.setChassisNumber("987654321");

        // Print updated information 
        System.out.println("Updated Car Number: " +myCar.getCarNumber());
        System.out.println("Updated Model Name: " + myCar.getModelName());
        System.out.println("Updated Chassis Number: " + myCar.getChassisNumber());
    }

}
