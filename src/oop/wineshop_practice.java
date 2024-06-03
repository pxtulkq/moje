package src.oop;

public class wineshop_practice {

    public static void main(String[] args) {
        WineShop winery = new WineShop();
        //prirazka 35%
//        winery.pricePerBottle = (int)(winery.pricePerBottle * 1.35);
        winery.pricePerBottle = 350;
        winery.balance = 5000;
        winery.sell(20);

        winery.buy(15);
        winery.printBalance();
        winery.sell(10);
        winery.printBalance();
    }
}
