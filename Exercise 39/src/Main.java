 class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String startEngine  () {
        return "Engine has started - Car class";
    }

    public String accelerate  () {
        return "Car is accelerating - Car class";
    }
    public String brake  () {
        return"Car is braking - Car class";
    }


}

class Honda extends Car {
    private String name;

    private boolean engine;
    private int wheels;
    private int cylinders;

    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

        public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public String startEngine  () {
        return "Engine has started - Honda Jazz class";
    }
    @Override
    public String  accelerate  () {
       return "Car is accelerating - Honda Jazz class";
    }
    @Override
    public String  brake  () {
       return "Car is braking - Honda Jazz class";
    }
}

class Toyota extends Car {
    private String name;

    private boolean engine;
    private int wheels;
    private int cylinders;

    public Toyota(String name, int cylinders) {
        super(name,cylinders);
        this.name = name;
        this.cylinders = cylinders;

    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String  startEngine  () {
        return "Engine has started - Toyota Yaris class";
    }

    public String accelerate  () {
        return"Car is accelerating - Toyota Yaris class";
    }
    public String  brake  () {
        return"Car is braking - Toyota Yaris class";
    }
}

 class TVR extends Car {
     private String name;

     private boolean engine;
     private int wheels;
     private int cylinders;

     public TVR(String name, int cylinders) {
         super(name, cylinders);
         this.name = name;
         this.cylinders = cylinders;

     }

     public String getName() {
         return name;
     }

     public int getCylinders() {
         return cylinders;
     }

     public String startEngine() {
         return "Engine has started - TVR Griff class";
     }

     public String accelerate() {
         return "Car is accelerating - TVR Griff class";
     }

     public String brake() {
         return "Car is braking - TVR Griff  class";
     }

 }

public class Main {
    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Car("Base car",  8 );
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Honda honda = new Honda("Honda Jazz",6);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());

        Toyota toyota = new Toyota("Toyota Yaris",6);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        TVR tvr = new TVR("TVR Griffith",8);
        System.out.println(tvr.startEngine());
        System.out.println(tvr.accelerate());
        System.out.println(tvr.brake());
    }

 }
