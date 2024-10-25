public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person("Jan","Kowalski",892233456);
        Adress adress1= new Adress();
        Adress adress2 = adress1;

        adress1.postCode = 33150;
        adress1.city = "New York";
        adress1.street = "Gough Drive";
        adress1.houseNumber = "12/4";

        person1.pesel = 892234876;
        person1.livingAdress =adress1;
        person1.officeAdress = adress2;


        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.amount = 12_456;
        credit1.interestRate = 0.10;

       BankAccount account1 = new BankAccount();


        AccountFactory account1Create = new AccountFactory();
        account1 = account1Create.createAccount(person1,002345,340_456);


        System.out.println("Osoba: "+person1.firstName+" "+person1.lastName);
        System.out.println("Konto: "+account1.accountNumber+" saldo: "+account1.funds);
        System.out.println("Adres zamieszkania: "+person1.livingAdress.city);
        System.out.println("Adres zameldowania: "+person1.officeAdress.city);
        System.out.println("Pesel: "+person1.pesel);


        AddPesel addPesel = new AddPesel();
        addPesel.addNumber(person1,3);

        System.out.println("Pesel: "+person1.pesel);

    }
}
