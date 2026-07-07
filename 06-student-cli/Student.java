public class Student{
    private int ID;
    private String name;
    private int age;
    private String course;

    public Student(){
    }

    public Student(int ID,String name, int age, String course){
        this.ID = ID;
        this.name = name;
        this.age= age;
        this.course= course;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getCourse(){
        return course;
    }

    public void printDetails(){
        System.out.println(
            "=========================\n\n ID       : "
            + ID 
            + "\nName     : " + name
            + "\nAge        : " + age
            +"\nCouse       : " + course
            + "\n\n=========================\n\n"
        );
    }

    public void printFound(){
        System.out.println(
            "Student Found\n"
            + "Name : " + name
            + "\nAge : " + age
            + "\nCourse : " + course
            + "\n"
        );
    }

    public void updateStudent(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
}