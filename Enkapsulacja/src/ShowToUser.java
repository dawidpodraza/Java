public class ShowToUser {

    void clientInfo(Client client,double price,double discountPrice) {
        welcomeMessege(client);
        printPrice(price);
        printDiscountPrice(discountPrice);

    }

    private void welcomeMessege(Client client){
        if(client.getFirstName()==null && client.getLastName()==null){
            System.out.println("Witaj nieznany uzytkowniku");
        }else if (client.getLastName()==null){
            System.out.println("Witaj " + client.getFirstName());
        }else if (client.getFirstName()==null){
            System.out.println("Witaj panie "+client.getLastName());
        }else{
            System.out.println("Witaj " + client.getFirstName()+" " + client.getLastName());
        }

    }
    private void printPrice (double price){
        System.out.println("Kwota przed rabatem: " +price);
    }

    private void printDiscountPrice(double discountPrice){
        System.out.println("Do zapłaty (po rabacie): "+ discountPrice );
    }
}
