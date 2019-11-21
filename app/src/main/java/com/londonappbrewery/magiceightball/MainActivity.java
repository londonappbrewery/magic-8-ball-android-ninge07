package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create variable name ballDisplay of type ImageView and assign it with the value image_eightBall
        final ImageView ballDisplay = findViewById (R.id.image_eightBall);

        //Create variable name askButton of type Button and assign it with the value askButton
        Button askButton = findViewById (R.id.askButton);

        //Create an Array of variable name ballArray of type int
        final int [] ballArray = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};
        //Set onClickListen on button to listen for clicks
        askButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                //This code is executed when the button is clicked

                //Create a random number generator
                Random randomNumberOperator = new Random ();

                //Make a random number generator spit out a new random number
                int number = randomNumberOperator.nextInt (5);

                //Set the ball image using an random image from the ballArray
                ballDisplay.setImageResource (ballArray[number]);
            }
        });


    }
}
