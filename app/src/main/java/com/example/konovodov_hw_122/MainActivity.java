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
    TextView textView2;
    ArrayList<Integer> screenCount = new ArrayList<>();
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
        screenCount.add(randomValue);

        currentItemValue = screenCount.size();

        textView.setText(getString(R.string.hyperlink1) + screenCount.get(currentItemValue - 1) + " currentItemValue = " + currentItemValue);
*/
        textView.setText(getString(R.string.hyperlink1) + randomValue);

//-----------------------------------------------------------------------------
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// отсчет в плюс
                Intent intent = new Intent (MainActivity.this/*getApplicationContext()*/, MainActivity.class);
                startActivityForResult(intent, -1);// startActivity(intent);

                /*
                if (currentItemValue == screenCount.size()) {
                    randomValue = (int) (Math.random() * 100);
                    screenCount.add(randomValue);
                    currentItemValue = screenCount.size();
                    textView.setText(getString(R.string.hyperlink1) + screenCount.get(currentItemValue - 1));

                } else {
                    currentItemValue++;
                    textView.setText(getString(R.string.hyperlink1) + screenCount.get(currentItemValue - 1));
                }
                textView2.setText("currentItemValue = " + currentItemValue);
                if ((randomValue%2)==0) {imagePlace.setImageResource(R.drawable.unicorn);}
                else {imagePlace.setImageResource(R.drawable.unicornfun);}

                */

            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//отсчет в минус
                onBackPressed();
                //Intent intent = new Intent (MainActivity.this/*getApplicationContext()*/, MainActivity.class);
                //startActivityForResult(intent, -1);// startActivity(intent);

                /*
                if (currentItemValue > 1) {
                    currentItemValue--;

                    textView.setText(getString(R.string.hyperlink1) + screenCount.get(currentItemValue - 1));
                } else {

                    System.exit(0);

                } // выход

                textView2.setText("currentItemValue = " + currentItemValue);

                 */
            }
        });

    }

}
