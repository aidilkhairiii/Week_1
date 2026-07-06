import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int num1,num2;
        float result;

        try {
                
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter num1: ");
            num1 = scan.nextInt();
            System.out.print("Enter num2: ");
            num2 = scan.nextInt();
            result = (float) num1/num2;
            System.out.println("Result: " + result);

            scan.close();


        } catch (InputMismatchException e) {
            System.out.println("Enter number only!");
        } catch (ArithmeticException e){
            System.out.println("Cannot devide by 0!");
        }
    }
}




