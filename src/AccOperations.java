public interface AccOperations {
    double checkBalance();

    Transaction makeTransfer(BankAccount receiverAccData, BankAccount senderAccData, double amount) throws AccOperationsExceptions;

    void makeDeposit(double amount);

}
