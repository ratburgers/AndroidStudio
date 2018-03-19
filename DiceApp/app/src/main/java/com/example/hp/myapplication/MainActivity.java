package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // field to hold the roll result
    TextView rollResult;

    // field to hold roll button
    Button rollD4;
    Button rollD6;
    Button rollD8;
    Button rollD10;
    Button rollD12;
    Button rollD20;
    Button rollD100;

    // field to hold random number generator
    Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link instances to widgets in the activity view
        rollResult = (TextView) findViewById(R.id.rollResult);
        rollD4 = (Button) findViewById(R.id.rollD4);
        rollD6 = (Button) findViewById(R.id.rollD6);
        rollD8 = (Button) findViewById(R.id.rollD8);
        rollD10 = (Button) findViewById(R.id.rollD10);
        rollD12 = (Button) findViewById(R.id.rollD12);
        rollD20 = (Button) findViewById(R.id.rollD20);
        rollD100 = (Button) findViewById(R.id.rollD100);
        rollResult.setText("");
        // vertical scroll allowed in design inspector, can scroll
        rollResult.setMovementMethod(new ScrollingMovementMethod());

        // create instance of on click listener to create functional button
        View.OnClickListener d4 = new View.OnClickListener() {
            @Override
            // on click we start method for roll dice
            public void onClick(View v) {
                rollD4();
            }
        };

        View.OnClickListener d6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollD6();
            }
        };

        View.OnClickListener d8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollD8();
            }
        };

        View.OnClickListener d10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollD10();
            }
        };

        View.OnClickListener d12 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollD12();
            }
        };

        View.OnClickListener d20 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollD20();
            }
        };

        View.OnClickListener d100 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollD100();
            }
        };

        // sets onClickListener to myClick
        rollD4.setOnClickListener(d4);
        rollD6.setOnClickListener(d6);
        rollD8.setOnClickListener(d8);
        rollD10.setOnClickListener(d10);
        rollD12.setOnClickListener(d12);
        rollD20.setOnClickListener(d20);
        rollD100.setOnClickListener(d100);

        // initialise random number generator
        rand = new Random();

        // create greeting
        Toast.makeText(getApplicationContext (), "Welcome to DiceOut!",Toast.LENGTH_SHORT).show();
    }

    public void rollD4(){
        int die4 = rand.nextInt(4)+1;

        String msg = "You rolled a D4, scoring " + die4 + "\n";

        rollResult.append (msg);
    }

    public void rollD6(){
        int die6 = rand.nextInt(6)+1;

        String msg = "You rolled a D6, scoring " + die6 + "\n";

        rollResult.append (msg);
    }

    public void rollD8(){
        int die8 = rand.nextInt(8)+1;

        String msg = "You rolled a D8, scoring " + die8 + "\n";

        rollResult.append (msg);
    }

    public void rollD10(){
        int die10 = rand.nextInt(10)+1;

        String msg = "You rolled a D10, scoring " + die10 + "\n";

        rollResult.append (msg);
    }

    public void rollD12(){
        int die12 = rand.nextInt(12)+1;

        String msg = "You rolled a D12, scoring " + die12 + "\n";

        rollResult.append (msg);
    }

    public void rollD20(){
        int die20 = rand.nextInt(20)+1;

        String msg = "You rolled a D20, scoring " + die20 + "\n";

        rollResult.append (msg);
    }

    public void rollD100(){
        int die100 = rand.nextInt(100)+1;

        String msg = "You rolled a D100, scoring " + die100 + "\n";

        rollResult.append (msg);
    }

}
