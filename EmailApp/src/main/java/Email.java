import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int passwordLength = 15;
    private int mailboxCapacity = 800;
    private String altEmail;


    

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

    //set department
    public void newDepartment(){
        System.out.println("New worker: " + firstName + " Enter your department code \n1 for Sales \n2 for Development \n3 for Accounting\n0 for none\nEnder department code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if(depChoice == 1){
            setDepartment("sales");
        }
        else if(depChoice == 2){
            setDepartment("acct");
        }
        else {
            setDepartment("");
        }

    }

    //generate a random password
    public String randomPassword(int length){
        String randomPW = "ABCDEFGHIJKLMNOPQRSTUZWXYZ01234567890-@$#%&;";
        char[] pass = new char[length];
        for(int i = 0; i<length; i++){
            int rand = (int) (Math.random() * randomPW.length());
            pass[i] = randomPW.charAt(rand);
        }
        return new String(pass);
    }


//setters

    //set mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    //set alternate email
    public void setAltEmail(String altEmail){
        this.altEmail = altEmail;
    }

    //change password
    public void changePassword(String password){
        this.password = password;
    }

    //getters
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAltEmail(){
        return altEmail;
    }

    public String getPassword(){
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


