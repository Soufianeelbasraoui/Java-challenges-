package class_objet;

public class BankAccount {
    double accountNumber;
    int balance;


    public BankAccount(double accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void displayBalance(){
        System.out.println("Numéro de compte : " + accountNumber);
        System.out.println("Solde actuel : " + balance);

    }
}
