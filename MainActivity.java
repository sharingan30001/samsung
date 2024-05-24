package com.example.project_samsung;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.example.project_samsung.color;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1, button2;
        final RelativeLayout relativeLayout;

        // set button 1 with its id
        button1 = findViewById(R.id.btVar1);

        // set button 2 with its id
        // set relative layout with its id
        relativeLayout = findViewById(R.id.rlVar1);

        // onClick function for button 1
        final int[] clickcount = {0};
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                Random color = new Random();
                relativeLayout.setBackgroundColor(Color.argb(255, color.nextInt(255), color.nextInt(255), color.nextInt(255)));
                clickcount[0]++;
                if(clickcount[0] == 1)
                {
                    //first time c
                    //licked to do this
                    Toast.makeText(getApplicationContext(),"Button clicked first time!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    //check how many times clicked and so on
                    Toast.makeText(getApplicationContext(),"Button clicked count is"+ clickcount[0], Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
