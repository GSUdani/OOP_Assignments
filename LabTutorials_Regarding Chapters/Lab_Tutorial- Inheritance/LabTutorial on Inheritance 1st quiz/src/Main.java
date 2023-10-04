public class Main {
    public static void main(String[] args) {
        // Create an object of the Manager class
        Manager mgr = new Manager();

        // Set the name of the manager
        mgr.setName("Mary");

        // Get the name of the manager
        String mgrName = mgr.getName();

        // Display the manager name
        System.out.println("Manager Name: " + mgrName);

        // Create an object of the Employee class
        Employee emp = new Employee();

        // Set the name of the employee
        emp.setName("Tom");

        // Get the name of the employee
        String empName = emp.getName();

        // Display the employee name
        System.out.println("Employee Name: " + empName);
    }
}
