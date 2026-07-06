import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age: ");
        age = scan.nextInt();

        try {
            checkAge(age);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        



    }

    public static void checkAge(int age) throws Exception{

        if(age<18){
            throw new Exception("Too young! ");
        }
    }
}