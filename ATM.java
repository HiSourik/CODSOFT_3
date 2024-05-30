import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Enter your PIN: ");
        int pin = scanner.nextInt();
        if (accountNumber == 123456789 && pin == 1234) 
            System.out.println("Welcome to the ATM!");
            System.out.println("What would you like to do?");
            System.out.println("1. Withdraw cash");
            System.out.println("2. Deposit cash");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
         
             int selection = scanner.nextInt();

            
            switch (selection) {
                case 1:
                    System.out.println("How much cash would you like to withdraw?");
                    int amount = scanner.nextInt();
                
                    if (amount <= 1000) {
                        System.out.println("Please collect your cash.");
                        System.out.println("Your new balance is: " + (1000 - amount));
                    } else {
                        System.out.println("You do not have enough money in your account.");
                    }
                    break;
                case 2: 
                    System.out.println("How much cash would you like to deposit?");
                    amount = scanner.nextInt();

                    
                    System.out.println("Your new balance is: " + (1000 + amount));
                    break;
                case 3:
                    
                    System.out.println("Your current balance is: 1000");
                    break;
                case 4:
                    
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        } 
}
