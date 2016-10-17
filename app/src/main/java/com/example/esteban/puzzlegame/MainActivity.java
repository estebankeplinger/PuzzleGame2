
package com.example.esteban.puzzlegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


/**
 * <h1>Welcome Screen!</h1>
 * This class allows the user to select a puzzle size to play the game
 * <p>
 *
 * @author  Esteban Keplinger
 * @version 1.0
 * @since   2016-10-13
 */
public class MainActivity extends AppCompatActivity {


    /**
     * This method is used to create a view
     * @param savedInstanceState
     * @return void
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is used to switch activities, to the Make3x3Puzzle class
     * @param view
     * @return void
     */
    public void make3x3(View view) {
        Intent intent = new Intent(this, Make3x3Puzzle.class);
        startActivity(intent);
    }

    /**
     * This method is used to switch activities, to the Make4x4Puzzle class
     * @param view
     * @return void
     */
    public void make4x4(View view) {
        Intent intent = new Intent(this, Make4x4Puzzle.class);
        startActivity(intent);
    }

    /**
     * This method is used to switch activities, to the Make5x5Puzzle class
     * @param view
     * @return void
     */
    public void make5x5(View view) {
        Intent intent = new Intent(this, Make4x4Puzzle.class);
        startActivity(intent);
    }


}//end class
