package com.example.mariovuksic.clockcolors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class ColorActivity extends AppCompatActivity {

    private static int [] colors = { Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, Color.GRAY };
    private static String [] words  = { "One", "Two", "Three", "Four", "Five" };
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int c = random.nextInt(4);
        int color = colors[c];

        int w = random.nextInt(4);
        String word = words[w];

        setContentView(R.layout.activity_color);
        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText(word);

        RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
        background.setBackgroundColor(color);



    }


}
