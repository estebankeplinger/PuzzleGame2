package com.example.esteban.puzzlegame;

import java.util.*;

/**
 * <h1>CardManager class</h1>
 * The CardManager class populates multiple data structures with playing
 * cards, to be used to play the game
 * <p>
 *
 * @author Esteban Keplinger
 * @version 1.0
 * @since 2016-10-13
 */
public class CardManager {
    ArrayList<Card> allPlayingCards = new ArrayList<>();
    ArrayList<String> cardCombinations = new ArrayList<String>();


    /**
     * This method populates cardCombinations with a series of Strings that are the cards
     *
     * @return void
     */
    public void populateCardCombinationsArrayList() {


        cardCombinations.add("Ace,Black,Clubs");
        cardCombinations.add("2,Black,Clubs");
        cardCombinations.add("3,Black,Clubs");
        cardCombinations.add("4,Black,Clubs");
        cardCombinations.add("5,Black,Clubs");
        cardCombinations.add("6,Black,Clubs");
        cardCombinations.add("7,Black,Clubs");
        cardCombinations.add("8,Black,Clubs");
        cardCombinations.add("9,Black,Clubs");
        cardCombinations.add("10,Black,Clubs");
        cardCombinations.add("Jack,Black,Clubs");
        cardCombinations.add("Queen,Black,Clubs");
        cardCombinations.add("King,Black,Clubs");

        cardCombinations.add("Ace,Black,Spades");
        cardCombinations.add("2,Black,Spades");
        cardCombinations.add("3,Black,Spades");
        cardCombinations.add("4,Black,Spades");
        cardCombinations.add("5,Black,Spades");
        cardCombinations.add("6,Black,Spades");
        cardCombinations.add("7,Black,Spades");
        cardCombinations.add("8,Black,Spades");
        cardCombinations.add("9,Black,Spades");
        cardCombinations.add("10,Black,Spades");
        cardCombinations.add("Jack,Black,Spades");
        cardCombinations.add("Queen,Black,Spades");
        cardCombinations.add("King,Black,Spades");

        cardCombinations.add("Ace,Red,Diamonds");
        cardCombinations.add("2,Red,Diamonds");
        cardCombinations.add("3,Red,Diamonds");
        cardCombinations.add("4,Red,Diamonds");
        cardCombinations.add("5,Red,Diamonds");
        cardCombinations.add("6,Red,Diamonds");
        cardCombinations.add("7,Red,Diamonds");
        cardCombinations.add("8,Red,Diamonds");
        cardCombinations.add("9,Red,Diamonds");
        cardCombinations.add("10,Red,Diamonds");
        cardCombinations.add("Jack,Red,Diamonds");
        cardCombinations.add("Queen,Red,Diamonds");
        cardCombinations.add("King,Red,Diamonds");

        cardCombinations.add("Ace,Red,Hearts");
        cardCombinations.add("2,Red,Hearts");
        cardCombinations.add("3,Red,Hearts");
        cardCombinations.add("4,Red,Hearts");
        cardCombinations.add("5,Red,Hearts");
        cardCombinations.add("6,Red,Hearts");
        cardCombinations.add("7,Red,Hearts");
        cardCombinations.add("8,Red,Hearts");
        cardCombinations.add("9,Red,Hearts");
        cardCombinations.add("10,Red,Hearts");
        cardCombinations.add("Jack,Red,Hearts");
        cardCombinations.add("Queen,Red,Hearts");
        cardCombinations.add("King,Red,Hearts");

    }


    /**
     * This method populates allPlayingCard arraylist with Card objects
     *
     * @return void
     */
    public void populateCardArrayList() {
        String[] tempArray;
        String tempLine;


        for (int i = 0; i < cardCombinations.size(); i++) {
            tempLine = cardCombinations.get(i);
            tempArray = tempLine.split(",");

            allPlayingCards.add(new Card(tempArray[0], tempArray[1], tempArray[2]));

        }
    }

    /**
     * This method shuffles the playing cards (twice)
     *
     * @return ArrayList<Card>
     */
    public ArrayList<Card> shufflePlayingCards() {
        Collections.shuffle(allPlayingCards);
        Collections.shuffle(allPlayingCards);

        return allPlayingCards;
    }

    /**
     * This method returns the allPLayingCards arraylist
     *
     * @return ArrayList<Card>
     */
    public ArrayList<Card> getCards() {
        return allPlayingCards;
    }


}//end class
