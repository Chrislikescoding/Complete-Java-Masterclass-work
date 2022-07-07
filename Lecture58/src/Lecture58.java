public class Lecture58 {
    public static void main(String[] args) {
        double totalCentimetres = calcFeetAndInchesToCentimetres(2,3);
        System.out.println("No of inches 1 = " + totalCentimetres);
        totalCentimetres = calcFeetAndInchesToCentimetres(27    );
        System.out.println("No of inches 2 = " + totalCentimetres);


    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        if ((feet < 0) || (inches < 0 || inches > 12)){
            System.out.println("Invalid value");
            return -1;}
        else {

         return ( (( feet * 12) + inches)) * (2.54);
        }


    }
    public static double calcFeetAndInchesToCentimetres(double inches) {

        if (inches < 0 )
            return -1;
        else {
            int feet = (int) inches/12;
            return calcFeetAndInchesToCentimetres (feet,(inches % 12));
        }


    }
}
