public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour <= 0) {
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);

    }

    public static void printConversion(double kilometersPerHour) {


        } else {
            long calculateMilesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + calculateMilesPerHour + " mi/h");
        }
    }
}
