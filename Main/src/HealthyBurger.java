public class HealthyBurger extends Hamburger {
    private String gherkin;
    private String mushroom;
    private String name;
    private String meat;
    private String breadRoll;
    private double totalPrice;

    public HealthyBurger(String name, String meat, String breadRoll, double totalPrice, String name1, String meat1) {
        super(name, meat, breadRoll, totalPrice);
        this.name = name1;
        this.meat = meat1;
        this.breadRoll = "brown rye bread";
        this.totalPrice = totalPrice;

    }



    @Override
    public void displayPrice() {
       System.out.println("This is a " + meat + " burger on " + breadRoll + " and costs " + totalPrice  );
    }

    @Override
    public double addExtras() {
        super.addExtras();
        int randomNumber = (int) (Math.random() * 2) + 1;

        switch (randomNumber) {
            case 1:
                totalPrice = addMushroom(totalPrice);

            case 2:
                totalPrice = addGherkin(totalPrice);
        }
        displayPrice();
        return totalPrice;
    }

    public double addMushroom(double totalPrice) {
        totalPrice +=0.40;
        System.out.println("Mushroom has been added at 40 cents");
        return totalPrice;
    }
    public double addGherkin(double totalPrice) {
        totalPrice +=0.35;
        System.out.println("Gherkin has been added at 35 cents");
        return totalPrice;
    }
}

