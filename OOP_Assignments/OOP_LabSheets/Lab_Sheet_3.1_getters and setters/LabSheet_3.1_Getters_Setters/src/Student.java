public class Student{
    private String name;
    private int age;
    private char grade;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name= newName ;
    }
    public int getAge(){
        return age;
    }
    /*public void setAge(int newAge){
        age= newAge ;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char newGrade){
        grade= newGrade ;
    }*/
    public void setAge(int newAge){
        if(newAge>0 && newAge <=120){
            age= newAge ;
        }else{
            System.out.println("Invalid age value");
        }
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char newGrade){
        if(newGrade>='A' && newGrade<='Z')
        {
            grade= newGrade ;
        } else{
            System.out.println("Invalid Grade value");
        }
    }

    public void displayInfo(){
        System.out.println("Name "+name); // System.out.println(name+ " "+age+ " " +grade);
        System.out.println("Age "+age);
        System.out.println("Grade "+grade);

    }

}
