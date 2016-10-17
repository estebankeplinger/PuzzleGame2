package com.example.esteban.puzzlegame;


/**
 * <h1>Create Card object</h1>
 * The Card class creates Card objects
 * <p>
 *
 * @author Esteban Keplinger
 * @version 1.0
 * @since 2016-10-13
 */
public class Card {

    String cardNum;
    String cardColor;
    String cardSuit;


    /**
     * This method is used to create Card objects
     *
     * @param cardNum,
     * @param cardColor
     * @param cardSuit
     */
    public Card(String cardNum, String cardColor, String cardSuit) {

        this.cardNum = cardNum;
        this.cardColor = cardColor;
        this.cardSuit = cardSuit;

    }

    /**
     * This method is used to invoke the toString method of
     * the card object
     *
     * @return String
     */
    public String toString() {
        return cardNum + " of " + cardSuit;
    }
}
