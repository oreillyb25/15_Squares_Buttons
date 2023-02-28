package com.example.a15_squares_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
//author: brigid o'reilly
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PuzzleView pv = new PuzzleView();
        PuzzleModel pm = pv.getPuzzleModel();
        PuzzleController pc = new PuzzleController(pv);

        Button r = findViewById(R.id.create);
        r.setOnClickListener(pc);

        //button array: i couldnt figure out how to get both in an array
        pm.buttons[0][0] = findViewById(R.id.button);
        pm.buttons[0][0].setOnClickListener(pc);
        pm.buttons[0][1] = findViewById(R.id.button2);
        pm.buttons[0][1].setOnClickListener(pc);
        pm.buttons[0][2] = findViewById(R.id.button3);
        pm.buttons[0][2].setOnClickListener(pc);
        pm.buttons[0][3] = findViewById(R.id.button4);
        pm.buttons[0][3].setOnClickListener(pc);

        pm.buttons[1][0] = findViewById(R.id.button5);
        pm.buttons[1][0].setOnClickListener(pc);
        pm.buttons[1][1] = findViewById(R.id.button6);
        pm.buttons[1][1].setOnClickListener(pc);
        pm.buttons[1][2] = findViewById(R.id.button7);
        pm.buttons[1][2].setOnClickListener(pc);
        pm.buttons[1][3] = findViewById(R.id.button8);
        pm.buttons[1][3].setOnClickListener(pc);

        pm.buttons[2][0] = findViewById(R.id.button9);
        pm.buttons[2][0].setOnClickListener(pc);
        pm.buttons[2][1] = findViewById(R.id.button10);
        pm.buttons[2][1].setOnClickListener(pc);
        pm.buttons[2][2] = findViewById(R.id.button11);
        pm.buttons[2][2].setOnClickListener(pc);
        pm.buttons[2][3] = findViewById(R.id.button12);
        pm.buttons[2][3].setOnClickListener(pc);

        pm.buttons[3][0] = findViewById(R.id.button13);
        pm.buttons[3][0].setOnClickListener(pc);
        pm.buttons[3][1] = findViewById(R.id.button14);
        pm.buttons[3][1].setOnClickListener(pc);
        pm.buttons[3][2] = findViewById(R.id.button15);
        pm.buttons[3][2].setOnClickListener(pc);
        pm.buttons[3][3] = findViewById(R.id.button16);
        pm.buttons[3][3].setOnClickListener(pc);

        pv.drawGrid();

    }
}