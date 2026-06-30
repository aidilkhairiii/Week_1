import java.util.Scanner;

public class student_registration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        int age= 0;
        String email ="";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scan.nextLine();
            if (name.isEmpty()){
                System.err.println("Name cannot be empty");
            }
        }

        while(age<= 18 || age >= 60){
            System.out.print("Enter your age: ");
            age = scan.nextInt();
            scan.nextLine();
            if (age <= 18 || age >= 60){
                System.err.println("Age is not in range");
            }
        }

        while(!email.contains("@")){
            System.out.print("Enter your email:");
            email = scan.nextLine();
            if (!email.contains("@")){
                System.err.println("Email is invalid");
            }
        }

        System.out.println("Name: " +  name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);

    }
}
