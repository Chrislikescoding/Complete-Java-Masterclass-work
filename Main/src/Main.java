public class Main {

    public static void main(String[] args) {
        Hamburger hamBurger = new Hamburger("Beefburger", "beef", "white roll", 2.00 );
        System.out.println("This burger costs " + hamBurger.addExtras());
        HealthyBurger healthyBurger = new HealthyBurger("Veggie", "bean", "brown rye",
                2.00," ", " " );
        System.out.println("This healthy burger costs " + healthyBurger.addExtras());

        DeluxeBurger deluxeBurger = new DeluxeBurger("deluxe", "salmon", "pumpkin bread",
                3.00);
        System.out.println("This deluxe burger costs " + deluxeBurger.constructBurger());


    }
}
