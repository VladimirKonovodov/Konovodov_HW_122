package com.example.konovodov_hw_122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.ls.LSOutput;

import java.lang.*;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imagePlace;
    Button nextButton;
    Button previousButton;
    TextView textView;

    int randomValue;
    int currentItemValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagePlace = (ImageView) findViewById(R.id.imageView);

        nextButton = (Button) findViewById(R.id.button2);
        previousButton = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        randomValue = (int) (Math.random() * 100);
        /*
        currentItemValue++;
        if ((currentItemValue%2)==0) {
            imagePlace.setImageResource(R.drawable.unicornfun);
        }
        else {imagePlace.setImageResource(R.drawable.unicorn);}
        */

        textView.setText(getString(R.string.hyperlink1) + randomValue);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// отсчет в плюс
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//отсчет в минус
                onBackPressed();
            }
        });

    }

}
