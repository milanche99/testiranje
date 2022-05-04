import java.util.Scanner;

public class Customer {
    private String firstName;
    private String lastName;
    private int Pin;
    private String bankName;
    private int accountNumber;
    private double balance;
    Scanner scanner=new Scanner(System.in);

    public Customer(String firstName, String lastName, int pin, double balance) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.Pin = pin;
            //this.accountNumber = accountNumber;
            this.balance = balance;
    }
    public Customer() {

    }
    public Customer(double balance){
        this.balance=balance;
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

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void openAccount(){
        System.out.println("Enter account first name: ");
        setFirstName(scanner.next());
        System.out.println("Enter account last name: ");
        setLastName(scanner.next());
        System.out.println("Enter account PIN: ");
        setPin(scanner.nextInt());
        if ((getPin()>999 && getPin()<10000)) {
            setPin(getPin());
        }
        else {
            System.out.println("PIN must have 4 numbers!!! ");
            System.out.println("Please run program again! " );
            System.exit(0);
        }
        System.out.println("Enter account balance: ");
        setBalance(scanner.nextDouble());
        accountNumber++;
    }

}
