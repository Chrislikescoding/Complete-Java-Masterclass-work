package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50,0,true);
        printer.fillToner(50);
        printer.fillToner(50);

        printer.printPage(5);
        System.out.println("Printing on duplex " + printer.getPagesPrinted() );
        System.out.println(printer.getPagesPrinted() + " pages were printed and " +  "  toner level is " + printer.getTonerLevel() );
    }
}
