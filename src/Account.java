
import java.util.ArrayList;
import java.util.Scanner;
public class Account {
    private int acc_no;
    private String name;
    private int balance = 0;

    public void createAccount(int acc) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your account number is: " + acc);
        acc++;
        System.out.println("Account created");
        System.out.print("Enter your name: ");
        name = input.next();
    }

    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        int n = input.nextInt();
        balance += n;
        System.out.println("Amount " + n + " is deposited");
    }

    public void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int n = input.nextInt();
        if (balance < n) {
            System.out.println("Insufficient amount");
        } else {
            balance = balance - n;
            System.out.println("Amount " + n + " is withdrawn");
        }
    }

    public void checkBalance() {
        System.out.println("Your account balance is " + balance);
    }
}

 class Main {
    public static void main(String[] args) {
        int acc = 0;
        ArrayList<Account> accounts = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        while (true) {
            Account a = new Account();
                System.out.print(" Enter 1 to open a new account\n Enter 2 to deposit\n Enter 3 to check balance\n Enter 4 to withdraw\n Enter 5 to exit: ");
                int choice = input.nextInt();
                if (choice == 5) {
                    break;
                }
                switch (choice) {
                    case 1:
                        a.createAccount(acc);
                        accounts.add(a);
                        acc++;
                        break;

                    case 2:
                        System.out.print("Select account number: ");
                        int account = input.nextInt();
                        accounts.get(account).deposit();
                        break;

                    case 3:
                        System.out.print("Select account number: ");
                        int accountNumber = input.nextInt();
                        accounts.get(accountNumber).checkBalance();
                        break;

                    case 4:
                        System.out.print("Select account number: ");
                        int accNumber = input.nextInt();
                        accounts.get(accNumber).withdraw();
                        break;
                }
            }
        }
    }



