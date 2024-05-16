package com.example.project_samsung;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                Random color = new Random();
                relativeLayout.setBackgroundColor(Color.argb(255, color.nextInt(255), color.nextInt(255), color.nextInt(255)));
            }
        });
    }
}