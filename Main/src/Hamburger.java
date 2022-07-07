public class Hamburger {
    //private String tomato;
  //  private String cheese;
  //  private String mayo;
  //  private String ketchup;
    private String name;
    private String meat;
    private String breadRoll;
    private double totalPrice;

    public Hamburger(String name, String meat, String breadRoll, double totalPrice) {
        this.name = name;
        this.meat = meat;
        this.breadRoll = breadRoll;
        this.totalPrice = totalPrice;

    }

    public Hamburger() {
    }

    public void displayPrice(){
            System.out.println("Burger price is " + totalPrice);
        System.out.println("This is a " + meat + " burger on " + breadRoll + " and costs " + totalPrice  );
    }

    private double addTomato(double totalPrice) {
    totalPrice +=.20;
        System.out.println("Tomato has been added at 20 cents");
        return totalPrice;
    }
    private double addKetchup(double totalPrice) {
        totalPrice +=.10;
        System.out.println("Ketchup has been added at 10 cents");
        return totalPrice;
    }
    private double addMayo(double totalPrice) {
        totalPrice +=.15;
        System.out.println("Mayo has been added at 15 cents");
        return totalPrice;
    }
    private double addCheese(double totalPrice) {
        totalPrice +=.50;
        System.out.println("Cheese has been added at 50c " );
        return totalPrice;
    }

    public double addExtras() {
        int randomNumber = (int) (Math.random() * 4) + 1;
               switch (randomNumber) {
            case 1:
                totalPrice = addTomato(totalPrice);

            case 2:
                totalPrice = addMayo(totalPrice);

            case 3:
                totalPrice = addKetchup(totalPrice);

            case 4:
                totalPrice = addCheese(totalPrice);

        }

        displayPrice();
        return totalPrice;
    }
}