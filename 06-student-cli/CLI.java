import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
    private Scanner scan = new Scanner(System.in);
    private String current = 
    "==================================\n"
    + "STUDENT MANAGEMENT SYSTEM\n"
    + "==================================\n\n"

    +"1. Add Student\n"
    +"2. View Students\n"
    +"3. Search Student\n"
    +"4. Update Student\n"
    +"5. Delete Student\n"
    +"6. Statistics\n"
    +"7. Exit\n\n"

    +"Choose:\n";

    private int choice;
    private HashMap<Integer,Student> studentMap = new HashMap<>();

    public void setChoice(int choice){
        this.choice = choice;
    }

    public String getCurrent(){
        return current;
    }

    public void setCLI(int choice){
        this.choice = choice;
        switch (choice) {
            case 1:
                addStudCLI();               
                break;

            case 2:
                viewStudentCLI();
                break;

            case 3:
                searchStudentCLI();
                break;

            case 4:
                updateStudentCLI();
                break;

            case 5:
                deleteStudentCLI();
                break;

            case 6:
                statistic();
                break;
       
            default:
                System.out.println(current);
                break;
        }
    }

    public void addStudCLI(){
        int ID;
        String name;
        int age;
        String course;
        Student student;

        try {
            System.out.print("Enter ID: ");
            ID = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Name: ");
            name = scan.nextLine();

            System.out.print("Enter age: ");
            age = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter course: ");
            course = scan.nextLine();


            student = new Student(ID, name, age, course);
            studentMap.put(ID, student);
            
        } catch (Exception e) {
            System.out.println("Invalid Output!");
        }


    }

    public void viewStudentCLI(){
        for(Student student: studentMap.values()){
            student.printDetails();
        }
    }

    public void searchStudentCLI(){
        try {
            searchStudent().printFound();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }

    private Student searchStudent() throws Exception{
        int ID;
        Student student = null;

        try {
            System.out.print("Enter student ID: ");
            ID = scan.nextInt();
            scan.nextLine();

            student = studentMap.get(ID);

            return student;
                    
        } catch (InputMismatchException e) {
            throw new Exception("Invalid input");
        }


        
    }

    public void updateStudentCLI(){
        Student student;
        String name;
        int age;
        String course;

        
        try {
            student = searchStudent();
            System.out.print("New Name : ");
            name = scan.nextLine();

            System.out.print("New Age : ");
            age = scan.nextInt();
            scan.nextLine();

            System.out.print("New Course : ");
            course = scan.nextLine();


            student.updateStudent(name, age, course);           
            
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

    }

    public void deleteStudentCLI(){
        Student student;
        String answer;

        
        try {
            student = searchStudent();

            student.printDetails();

            System.out.println("Delete?");
            System.out.println("(Y/N)");
            answer = scan.nextLine();

            if(answer.equals("Y")){
                studentMap.remove(student.getID());
                System.out.println("Deleting......");
            }else{
                System.out.println("No Deletion");
            }
        } catch (Exception e) {
            System.out.println("Inavlid input!");
        }
        
    }

    public void statistic(){
        System.out.println("Total students : " + studentMap.size());
        System.out.println("Average Age: " + averageAge());
        System.out.println("Oldest student: " + oldestStud().getName());
        System.out.println("Yougest student: " + youngestStud().getName());

    }

    private int averageAge(){
        int result;
        int sum=0;
        for(Student student : studentMap.values()){
            sum += student.getAge();
        }
        result = sum/studentMap.size();

        return result;
    }

    private Student oldestStud(){
        Student oldStud = new Student();
        int oldestAge = 0;
        for(Student student : studentMap.values()){
            if (student.getAge() > oldestAge){
                oldestAge = student.getAge();
                oldStud = student;
            }
        }
        return oldStud;
    }

    private Student youngestStud(){
        Student youngestStud = null;
        for(Student student : studentMap.values()){
            if (youngestStud == null || student.getAge()<youngestStud.getAge()){
                youngestStud = student;
            }
        }      
        return youngestStud;
    }


}
