import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        System.out.println("Starting.......");
        Scanner scan = new Scanner(System.in);
        int choice;

        while(true){
            choice = 0;
            System.out.println(cli.getCurrent()); 
            choice = scan.nextInt();
            System.out.println(" ");
            if(choice == 7){
                break;
            }
            scan.nextLine();
            cli.setCLI(choice);
        }
    }
}
