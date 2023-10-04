public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /*public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    } */

    @Override
    public String toString() {
        
        String dayStr = String.format("%02d", day);      // Format the date as "dd/mm/yyyy" with leading zeros
        String monthStr = String.format("%02d", month);
        return dayStr + "/" + monthStr + "/" + year;            // return day+ " " +month+ " " +year;
    }

  
        public static void main(String[] args) {
            // Create a Date object
            Date myDate = new Date(9, 9, 2023);
    
            // Display the date
            System.out.println("Initial Date: " + myDate.toString());
    
            // Set the date components
            myDate.setDay(15);
            myDate.setMonth(12);
            myDate.setYear(2024);
    
            // Display the updated date
            System.out.println("Updated Date: " + myDate.toString());
        }
    }
    
