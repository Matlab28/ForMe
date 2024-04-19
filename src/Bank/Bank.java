package Bank;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit();
        System.out.println(bankAccount);
    }
}
