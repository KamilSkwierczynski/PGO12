public class Employee extends User{
    private int employeeId;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = employeeId();
    }

    public Client createClient(String firstName, String lastName, BankAccount account) {
        return new Client(firstName, lastName, account);
    }

    public BankAccount openBankAccount() {
        return new BankAccount();
    }

    public BankAccount acceptPayment(double balance) {
        return new BankAccount(balance);
    }

    public Transaction makeTransfer(Client client, BankAccount receiverAccount, double amount) throws AccOperationsExceptions {
        return new Transaction(client.getAccount(), receiverAccount, amount);
    }
}
}
