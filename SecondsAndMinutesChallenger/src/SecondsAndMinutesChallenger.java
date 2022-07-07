

public class SecondsAndMinutesChallenger {
    public static void main(String[] args) {

        System.out.println(getDurationString(60059));

        System.out.println(getDurationString(162, 59));
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

        printEqual(-1, 1, 1);
        printEqual(1, 1, 1);
        printEqual(2, 1, 3);
        printEqual(2, 1, 1);
    }

public static String getDurationString (long minutes, long seconds){
 if (minutes < 0 || (seconds <0 || seconds >59))
        return ("Invalid Value");
    else {
    long hours = minutes/60;
    long remainingMinutes = minutes % 60;
    String time1 = ( hours + "h " + remainingMinutes +"m " + seconds + "s ");
   return time1;
    }
 }
    public static String getDurationString ( long seconds) {
        if (seconds < 0)
            return ("Invalid Value");
        else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            String time2 = getDurationString(minutes, remainingSeconds);;
            return time2;
        }
    }



    public static double area ( double radius) {
    double area = radius * radius * Math.PI;
    if (radius < 0)
        return -1;

         return area;
    }
    public static double area ( double x, double y) {

        if (x < 0  || y < 0) {
            return -1;
        }
        else {
        double area = x * y;

        return area;
        }
    }

    public static void printYearsAndDays ( long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else {
            long years = (minutes / (60 * 24 * 365));
            long days = (minutes / (60 * 24));
            long daysOver = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + daysOver + " d");
        }
    }
    public static void printEqual ( int first, int second, int third) {

        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        } else {
            if (first == second && second == third) {
                System.out.println("All numbers are equal");
            } else {
                if (first != second && second != third && first != third ) {
                    System.out.println("All numbers are different");
                } else {
                    System.out.println("Neither all are equal or different");
                }
           }
        }

    }

    public static boolean isCatPlaying ( boolean summer, int temperature) {

        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else {
            if (!summer &&  temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }

    }

}