
public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null, null, true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        ShowToUser showToUser = new ShowToUser();
        showToUser.clientInfo(client1,price1,priceDiscount1);

    }
}