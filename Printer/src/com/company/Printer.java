package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex ;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int fillToner(int tonerAmount){

        if ((this.tonerLevel + tonerAmount) > 100) {
            System.out.println("Too much toner, toner not added");
             } else {
            this.tonerLevel += tonerAmount;


            if (this.tonerLevel == 100) {
                System.out.println("Toner is full");
            }

        }
        return this.tonerLevel;
  }

    public int printPage(int pages ){

        this.pagesPrinted += pages;
       // int tonerUsed = pagesPrinted * 5;

        if (duplex =true);
        {
            pagesPrinted = (pages / 2) + (pages % 2);

        }

        return this.pagesPrinted;

    }
}
