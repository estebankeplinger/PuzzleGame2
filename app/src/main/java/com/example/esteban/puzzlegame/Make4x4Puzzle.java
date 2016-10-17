package com.example.esteban.puzzlegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * <h1>Play 3x3 Puzzle!</h1>
 * The Make3x3Puzzle java class allows the user to play a puzzle of size 3x3.
 * <p>
 * <b>Note:</b> This class only allows users to play a puzzle of size 3x3
 *
 * @author Esteban Keplinger
 * @version 1.0
 * @since 2016-10-13
 */
public class Make4x4Puzzle extends AppCompatActivity {

    CardManager cm = new CardManager();
    ArrayList<Card> cardArrayList = new ArrayList<Card>();
    Card[][] cards;
    Button[][] buttons = new Button[4][4];
    GridLayout gridLayout;
    ArrayList<String> isGameFinishedArray;


    int rowPressed;
    int colPressed;
    int colOfBlankTile;
    int rowOfBlankTile;
    CharSequence textToSwitch;


    /**
     * This method is used to create a gridLayout, and
     * populate the gridLayout with a 2D array of buttons.
     * The method then waits for user to click and invoke
     * the onClick method.
     *
     * @param savedInstanceState savedState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make4x4_puzzle);

        gridLayout = new GridLayout(this);
        gridLayout.setAlignmentMode(GridLayout.ALIGN_BOUNDS);
        gridLayout.setColumnCount(4);
        gridLayout.setRowCount(4);
        setContentView(gridLayout);
        ArrayListTo2dArray();

        //Iterates through the 2D array of Buttons
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {


                //buttons[i][j] = cards[k][l];
                buttons[i][j] = new Button(this);

                //populating 2D button array with the contents of the 2D Card array
                buttons[i][j].setText(cards[i][j].toString());
                gridLayout.addView(buttons[i][j], 275, 300);//add buttons to the gridLayout
                buttons[0][0].setText("");//create a blank tile to play the game

                //variables used to store location of the blank tile
                rowOfBlankTile = 0;
                colOfBlankTile = 0;

                //for each button made, attach an onClickListener to that button
                buttons[i][j].setOnClickListener(new View.OnClickListener() {

                    /**
                     * This method is invoked once a button is clicked on the grid.
                     * It is used as the core of the puzzle game, and this method encapsulates the
                     * @param v the view
                     */
                    public void onClick(View v) {


                        //iterate through the 2D array of buttons
                        for (int i = 0; i < buttons.length; i++) {
                            for (int j = 0; j < buttons[i].length; j++) {

                                if (buttons[i][j].isPressed()) {

                                    if (isGameOver() == true) {
                                        goToMainScreen();
                                    }

                                    rowPressed = i;
                                    colPressed = j;

                                    if (isValidMove(i, j) == true) {


                                        textToSwitch = buttons[i][j].getText();
                                        buttons[rowOfBlankTile][colOfBlankTile].setText(textToSwitch);
                                        rowOfBlankTile = i;
                                        colOfBlankTile = j;

                                        buttons[i][j].setText("");

                                    }
                                }
                            }
                        }


                    }//end onClick sub-method
                });
            }
        }//end for loop (outer)


    }//end onCreate method

    /**
     * This method checks to see if a valid move is trying to be executed
     *
     * @return boolean
     */
    public boolean isValidMove(int rowI, int columnJ) {


        //if button is pressed, get the text from it
        //get the row and col of the blank, set the contents to string
        //set the blank to the coordinates of the pressed button
        //make the button that was pressed blank

        //if the row is the same, col 1 more or one less
        //if the column is the same, row 1 more or 1 less
        //only move button if it is a neighbor of the blank tile
        if (rowI == rowOfBlankTile && columnJ == colOfBlankTile || columnJ == colOfBlankTile + 1 || columnJ == colOfBlankTile - 1) {
            return true;
        }
        if (columnJ == colOfBlankTile && rowI == rowOfBlankTile || rowI == rowOfBlankTile + 1 | columnJ == rowOfBlankTile - 1) {
            return true;
        } else
            return false;
    }//end isValidMove method

    /**
     * This method checks to see if the tiles are in the correct order
     *
     * @return boolean
     */
    public boolean isGameOver() {
        String[] tempArray;
        String tempLine;


        return false;


    }//end playGame method

    /**
     * This method displays a help message to the user
     *
     * @return boolean
     */
    public String displayHelpMessage(View view) {
        String message = "To play, simply click the tiles and place them in their respective order.";

        ImageView imageView = (ImageView) view;
        imageView.setContentDescription(message);

        return message;
    }

    /**
     * This method returns to the main screen if the game is over
     *
     */
    public void goToMainScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * This method gets gets an arraylist from CardManager, populates the arraylist
     * with Card objects, shuffles the cards (twice), and adds the contents to the
     * data structure of the class. The method then populates the cards 2D array
     *
     */
    public void ArrayListTo2dArray() {

        int tempVar = 0;


        cm.populateCardCombinationsArrayList();
        cm.populateCardArrayList();

        cm.shufflePlayingCards();
        cm.shufflePlayingCards();

        cardArrayList.addAll(cm.getCards());
        cards = new Card[4][4];

        System.out.println(cards.length);

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {

                cards[i][j] = cardArrayList.get(tempVar);
                tempVar++;
            }
        }//end for


    }//end method

}//end class






