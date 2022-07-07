package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        int position = 0;
        int score = 1500;

        int rank = calculateHighScorePosition(score);
        displayHighScorePosition("Chris", rank);

        score = 900;
        rank = calculateHighScorePosition(score);
        displayHighScorePosition("Jas", rank);

        score = 400;
        rank = calculateHighScorePosition(score);
        displayHighScorePosition("Alan", rank);

        score = 50;
        rank = calculateHighScorePosition(score);
        displayHighScorePosition("John", rank);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }


    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500 ) {
//            return 2;
//        } else if (score >= 100 ) {
//            return 3;
//        }
//            return 4;
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 ) {
              position = 2;
        } else if (score >= 100 ) {
              position = 3;
        }
            return position;
    }
}

