import java.util.Scanner;

public class EmailApplication {
    

    public static void main(String[] args){
        EmailApplication cli = new EmailApplication();
        cli.run();
    }

    public void displayMenu(){
        System.out.println("***************************************");
        System.out.println("** Congrats on Your New Position!!!! **");
        System.out.println("** Please Fill out Info to Continue! **");
        System.out.println("***************************************");
    }

    public void run(){
        displayMenu();
        Email email = new Email();
        while(true){
            displayOptions();
            break;


        }
    }


    public void displayOptions(){
        Email email = new Email();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String name = scanner.nextLine();
        email.setFirstName(name);
        System.out.println("Please Enter Last Name");
        String last = scanner.nextLine();
        email.setLastName(last);
        email.newDepartment();

        System.out.println("Your New Email is:");
        System.out.println(email.getFirstName() + "." + email.getLastName() + "@" + email.getDepartment() + "." + "outlook.com");
        System.out.println("Newly generated Password is: " + email.randomPassword(15));
        System.out.println(email.showInfo());

    }
}
