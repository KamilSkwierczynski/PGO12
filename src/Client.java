public class Client extends User{
    private final BankAccount account;
    private int clientId;
    public Client(String fName, String lName, BankAccount account){
        super(fName, lName);
        this.account = account;
        this.clientId = clientId;
    }
    public double checkBalance() {
        return account.checkBalance();
    }

    public Transaction makeTransfer(BankAccount receiverAccount, double amount) throws AccOperationsExceptions {
        return account.makeTransfer(receiverAccount, amount);
    }

    public Transaction makeTransfer(Client receiverAccount, double amount) throws AccOperationsExceptions {
        return account.makeTransfer(receiverAccount.getAccount(), amount);
    }

    public void makeDeposit(double amount) {
        account.makeDeposit(amount);
    }

    public BankAccount getAccount() {
        return account;
    }

}
