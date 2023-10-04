public class Student{
    private String name;
    private int age;
    private char grade;

    Student(){
        name="Joe";
        age=23;
        grade='A';
    }

    Student(String n, int a, char g){
        name=n;
        age=a;
        grade=g;
    }

    Student(String n, int a){
        name=n;
        age=a;
        grade='N';
    }

    void displayInfo(){
        System.out.println("Name:" +name);  //System.out.println(name+ +age+ +grade);
        System.out.println("Age:"+age);
        System.out.println("Grade:" +grade);

    }



}
