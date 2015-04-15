/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess.service;

import java.util.Random;

/**
 *
 * @author Ankita
 */
public class numberGuessService {

    private int randomNo;

    public numberGuessService() {
        Random randomNnumber = new Random();
        randomNo = randomNnumber.nextInt(9) + 1;
    }

    public String checkNumber(String guess) {

        int numberGuess = Integer.parseInt(guess);
        if (numberGuess == randomNo) {
            return "Correct Guess";
        } else {
            return "Incorrect Guess Try Again";
        }

    }

}
