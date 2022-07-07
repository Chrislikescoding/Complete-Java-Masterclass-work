package com.company;

public class Printer {

        private int tonerLevel = 100;
        private int pagesPrinted = 0;
        private boolean duplex;

        public Printer(int tonerLevel,  boolean duplex) {
            this.tonerLevel = tonerLevel;
            this.duplex = duplex;
        }


        public int getPagesPrinted() {
            return pagesPrinted;
        }

        public int addToner(int tonerAmount) {

            if (tonerAmount > 0 && tonerAmount <= 100) {
                if ((this.tonerLevel + tonerAmount) > 100) {
                    return -1;
                } else {
                    this.tonerLevel += tonerAmount;
                    return this.tonerLevel;
                }
            } else {
                return -1;
            }
        }

        public int printPages(int pages ){

            this.pagesPrinted += pages;

            int pagesToPrint = pages;

            if (duplex);
            {
                pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
                System.out.println("Printing in duplex mode");

            }
            this.pagesPrinted +=pagesToPrint;

            return pagesToPrint;

        }
    }

