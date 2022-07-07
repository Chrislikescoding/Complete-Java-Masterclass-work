package com.example.mypackage;

import java.util.Map;

public class MainChallenge {

    private static StockList stockList = new StockList();
    private static Basket chrisBasket = new Basket("Chris");
    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);
        System.out.println("First car quantity" + temp.quantityInStock());
        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);
        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

       System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
          System.out.println(s);
         }
        System.out.println(" -- Reserving a car -- ");
        reserveItem(chrisBasket, "car", 1);
        System.out.println("********************************************");
        System.out.println(" -- Reserving a second car -- ");
        reserveItem(chrisBasket, "car", 1);
        System.out.println("********************************************");
        System.out.println(" -- Reserving a non-existing third car -- ");
        reserveItem(chrisBasket, "car", 1);
        System.out.println("********************************************");
        System.out.println(chrisBasket);
        System.out.println("********************************************");
        System.out.println(" -- Unreserving a car -- ");
        unreserveItem(chrisBasket, "car", 1);
        System.out.println(chrisBasket);
        System.out.println("********************************************");
        reserveItem(chrisBasket, "juice", 6);
        reserveItem(chrisBasket, "vase", 10);
        System.out.println("********************************************");
        System.out.println("reserving item not in basket ");
        reserveItem(chrisBasket, "monitor ", 10);
        System.out.println("********************************************");
        System.out.println("reserving item qty too high "); System.out.println("********************************************");
        reserveItem(chrisBasket, "door ", 5);

        System.out.println(" -- Go to Checkout (clean basket and update stock list) --");

        System.out.println("Chris basket 1" + chrisBasket);
        unreserveItem(chrisBasket, "vase", 10);
        reserveItem(chrisBasket, "car", 1);
        System.out.println("Chris basket 2" + chrisBasket ) ;

        System.out.println(" -- Go to Checkout (clean basket and update stock list) --");
        checkOut(chrisBasket);

      System.out.println(stockList);

   }
    public static int reserveItem(Basket basket, String item, int quantityToReserve) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return -1;
        }
            int reservedQuantity = stockItem.getReserved() + quantityToReserve;
            int stockAvailability = stockItem.quantityInStock() - reservedQuantity;

            if(quantityToReserve >=0 && stockAvailability >= 0) {
                stockItem.setReserved(reservedQuantity);
                basket.addToBasket(stockItem, quantityToReserve );
                System.out.println(item + " reserved ");
                return reservedQuantity;
            }
                if (stockAvailability < 0) {
                System.out.println("not enough available quantity in stock");
        }
                return -1;
    }


    private static int unreserveItem(Basket basket, String itemName, int quantityToUnreserve) {
        // retrieve the item from the stock list
        StockItem stockItem = stockList.get(itemName);
        if (stockItem == null) {
            System.out.println("We don't sell " + itemName);
            return -1;
        }
        // check if the item is already in the basket
        if (basket.Items().get(stockItem) == null) {
            System.out.println("Basket does not contain the item " + itemName);
            return -1;
        }
        int reservedQuantity = stockItem.getReserved();
        int deltaReservation = reservedQuantity - quantityToUnreserve;
        if ((quantityToUnreserve >= 0) && (deltaReservation >= 0)) {
           // System.out.println("unreserve " + quantityToUnreserve + " rq " + reservedQuantity);
            stockItem.setReserved(reservedQuantity - quantityToUnreserve);
          //  System.out.println("reserved " + stockItem.getReserved() + "qto Un " +  quantityToUnreserve);
            basket.addToBasket(stockItem, -quantityToUnreserve);
            return quantityToUnreserve;
        }
        if (deltaReservation < 0) {
            System.out.println("The number of items to reserve/unreserve must be less or equal than the items quantity in stock.");
        }
        return -1;
    }
        private static Basket checkOut(Basket basket) {

        for (Map.Entry<StockItem, Integer> item : chrisBasket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
            System.out.println(item.getKey() + ". " + item.getValue() + " sold ");
        }
        basket.emptyBasket();
        return basket;

    }

}