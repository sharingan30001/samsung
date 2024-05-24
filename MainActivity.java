package com.example.project_samsung;

import static android.app.ProgressDialog.show;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.example.project_samsung.color;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        Button button1, button2;
        final RelativeLayout relativeLayout;
        // set button 1 with its id

        // set button 2 with its id
        // set relative layout with its id
        relativeLayout = findViewById(R.id.rlVar1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                String[] a = text.split(" ");
                Integer[] ints = new Integer[3];
                for (int i = 0; i < a.length; ++i) {
                    ints[i] = Integer.parseInt(a[i]);
                }
                color c = new color();
                String ans = c.getColorNameFromRgb(ints[0], ints[1], ints[2]);
                relativeLayout.setBackgroundColor(Color.argb(255, ints[0], ints[1], ints[2]));
            }
        });
    }
}