public class Transaction {
private final BankAccount receiverAccData;
private final BankAccount senderAccData;
private final double amount;

public Transaction(BankAccount receiverAccData, BankAccount senderAccData, double amount) throws AccOperationsExceptions {
    if (senderAccData.balance < amount) {
        throw new AccOperationsExceptions("Not enougth balance")
    }

    senderAccData.balance -= amount;
    receiverAccData.balance += amount;
    senderAccData.numberOfTransactions++;
    receiverAccData.numberOfTransactions++;

    this.senderAccData = senderAccData;
    this.receiverAccData = receiverAccData;
    this.amount = amount;
}

public double getAmount() {
    return amount;
}
public BankAccount getReceiverAccData() {
    return receiverAccData;
}
    public BankAccount getSenderAccData() {
        return senderAccData;
    }
}
