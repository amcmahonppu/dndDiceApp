package com.amcmahon.dungeondiceroller;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.amcmahon.dungeondiceroller.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView d4;
    TextView d6;
    TextView d8;
    TextView d10;
    TextView d12;
    TextView d20;
    TextView textDecimal;

    Button button4;
    Button button6;
    Button button8;
    Button button10;
    Button button12;
    Button button20;
    Button buttonDecimal;
    Button rollAll;
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d4 = (TextView)findViewById(R.id.d4);
        d6 = (TextView)findViewById(R.id.d6);
        d8 = (TextView)findViewById(R.id.d8);
        d10 = (TextView)findViewById(R.id.d10);
        d12 = (TextView)findViewById(R.id.d12);
        d20 = (TextView)findViewById(R.id.d20);
        textDecimal = (TextView)findViewById(R.id.textDecimal);
        rollAll = (Button) findViewById(R.id.rollAll);
        button4 = (Button) findViewById(R.id.button4);
        button6 = (Button) findViewById(R.id.button6);
        button8 = (Button) findViewById(R.id.button8);
        button10 = (Button) findViewById(R.id.button10);
        button12 = (Button) findViewById(R.id.button12);
        button20 = (Button) findViewById(R.id.button20);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        reset = (Button) findViewById(R.id.reset);



        rollAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int d4roll = new Random().nextInt(4) + 1;
                int d6roll = new Random().nextInt(6) + 1;
                int d8roll = new Random().nextInt(8) + 1;
                int d10roll = new Random().nextInt(10) + 1;
                int d12roll = new Random().nextInt(12) + 1;
                int d20roll = new Random().nextInt(20) + 1;
                int textDecimalroll = new Random().nextInt(10);

                d4.setText(String.valueOf(d4roll));
                d6.setText(String.valueOf(d6roll));
                d8.setText(String.valueOf(d8roll));
                d10.setText(String.valueOf(d10roll));
                d12.setText(String.valueOf(d12roll));
                d20.setText(String.valueOf(d20roll));
                textDecimal.setText("." + String.valueOf(textDecimalroll));

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d4roll = 0;
                int d6roll = 0;
                int d8roll = 0;
                int d10roll = 0;
                int d12roll = 0;
                int d20roll = 0;
                int textDecimalroll = 0;

                d4.setText(String.valueOf(d4roll));
                d6.setText(String.valueOf(d6roll));
                d8.setText(String.valueOf(d8roll));
                d10.setText(String.valueOf(d10roll));
                d12.setText(String.valueOf(d12roll));
                d20.setText(String.valueOf(d20roll));
                textDecimal.setText("." + String.valueOf(textDecimalroll));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d4roll = new Random().nextInt(4) + 1;
                d4.setText(String.valueOf(d4roll));

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d6roll = new Random().nextInt(6) + 1;
                d6.setText(String.valueOf(d6roll));

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d8roll = new Random().nextInt(8) + 1;
                d8.setText(String.valueOf(d8roll));

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d10roll = new Random().nextInt(10) + 1;
                d10.setText(String.valueOf(d10roll));

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d12roll = new Random().nextInt(12) + 1;
                d12.setText(String.valueOf(d12roll));

            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d20roll = new Random().nextInt(20) + 1;
                d20.setText(String.valueOf(d20roll));

            }
        });
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int textDecimalroll = new Random().nextInt(10);
                textDecimal.setText("." + String.valueOf(textDecimalroll));

            }
        });
    }
}