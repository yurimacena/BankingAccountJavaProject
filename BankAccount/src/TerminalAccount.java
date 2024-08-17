import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        //TO DO: learn and import the scanner class;
        //show the mensages for our user;
        //obtain by the scanner values type in terminal;
        //show the create account
        System.out.println("Welcome to our banking system! Please, write your name: ");
        Scanner objName = new Scanner(System.in);
        String clientName = objName.nextLine();


        System.out.println("Please, type the agency: ");
        Scanner objAgency = new Scanner(System.in);
        String agencyName = objAgency.nextLine();


        System.out.println("Please, insert the number: ");
        Scanner objNumber = new Scanner(System.in);
        int Number = objNumber.nextInt();


        System.out.println("Please, write your balance: ");
        Scanner objBalance = new Scanner(System.in);
        Double balance = objBalance.nextDouble();


        System.out.println("Hello " + clientName + ", thank you for create an account in our bank! Your agency is " + agencyName + ", account " + Number + " and your balance " + balance + " are available to withdraw.");
    }
}
