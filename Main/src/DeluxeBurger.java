public class DeluxeBurger extends Hamburger{
    private String chips;
    private String drink;
    private String name;
    private String meat;
    private String breadRoll;
    private double totalPrice;

    public DeluxeBurger(String name, String meat, String breadRoll, double totalPrice) {
    this.name = name;
    this.meat = meat;
    this.breadRoll = breadRoll;
    this.totalPrice = totalPrice;
    }


    public double constructBurger() {
        addChips();
        addDrink();
        return totalPrice;
           }

    public  void addChips() {
        System.out.println("Chips added to deluxe burger");
       }
    public  void addDrink() {
        System.out.println("Drink added to deluxe burger");
    }
}
