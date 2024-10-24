public class AccountFactory {
    BankAccount createAccount(Person person,int accountNumber,double funds){
        BankAccount account = new BankAccount();
        account.owner = person;
        account.accountNumber = accountNumber;
        account.funds = funds;
        return account;
    }
}
