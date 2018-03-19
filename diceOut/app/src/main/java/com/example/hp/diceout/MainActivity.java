package com.example.hp.diceout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // field to hold the roll result
    private TextView rollResult;

    // field to hold roll button
    Button rollButton;

    // field to hold the score
    int score;

    // field to hold random number generator
    Random rand;

    // fields to hold dice value
    // array list to hold all dice values
    ArrayList<Integer> dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set initial score
        score = 0;

        // link instances to widgets in the activity view
        rollResult = findViewById(R.id.rollResult);
        rollButton = findViewById(R.id.rollButton);

        // initialise random number generator
        rand = new Random();

        // create array list container for dice values
        dice = new ArrayList<Integer>();

        // create greeting
        Toast.makeText(getApplicationContext (), "Welcome to DiceOut!",Toast.LENGTH_SHORT).show();
    }

    public void rollDice(View v) {
        String clicked = "Clicked";
        rollResult.setText(clicked);

        // roll dice
        int die1 = rand.nextInt(6)+1;
        int die2 = rand.nextInt(6)+1;
        int die3 = rand.nextInt(6)+1;

        // set dice values into an array list
        dice.clear();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);

        // build message with result
        String msg = "You rolled a " + die1 + ", a " + die2 + " and a " + die3;

        // update the app to display result message
        rollResult.setText(msg);

        /*
        // display random number on button click
        int num = rand.nextInt(6)+1;
        String randomValue = "Number Generated: " + num;
        Toast.makeText(getApplicationContext(),randomValue,Toast.LENGTH_SHORT).show();
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
