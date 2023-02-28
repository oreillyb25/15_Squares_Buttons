package com.example.a15_squares_buttons;

import android.graphics.Color;
import android.view.View;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PuzzleView {
    private PuzzleModel pm = new PuzzleModel();
    public PuzzleModel getPuzzleModel(){
        return pm;
    }
    /*
    need to:
    set button text, visibility, set background color, set clickable: check if its the last number
    need to get the row and col of the clicked button: use view button, should do in controller
     */

    public void drawGrid(){
        for(int i = 0; i < 16; i++){
            pm.shuf[i] = i + 1;
        }
        List<Integer> shuffle = Arrays.asList(pm.shuf);
        Collections.shuffle(shuffle);
        shuffle.toArray(pm.shuf);

        int x = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pm.arr[i][j] = pm.shuf[x];
                x++;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pm.buttons[i][j].setText(pm.arr[i][j] + "");
                pm.buttons[i][j].setBackgroundColor(Color.RED);
                pm.buttons[i][j].setClickable(true);
                pm.buttons[i][j].setVisibility(View.VISIBLE);

                if(pm.arr[i][j] == 16){
                    pm.buttons[i][j].setClickable(false);
                    pm.buttons[i][j].setVisibility(View.INVISIBLE);
                }

                if(pm.buttons[i][j].getText().equals(String.valueOf(pm.check[i][j]))){
                    pm.buttons[i][j].setBackgroundColor(Color.GREEN);
                }
            }
        }
    }
    public void move(int row, int col, int newRow, int newCol){
        int temp;
        temp = pm.arr[row][col];
        pm.arr[row][col] = pm.arr[newRow][newCol];
        pm.arr[newRow][newCol] = temp;
        //swapping spots
        pm.buttons[row][col].setVisibility(View.INVISIBLE);
        pm.buttons[newRow][newCol].setVisibility(View.VISIBLE);
        pm.buttons[row][col].setText(String.valueOf(pm.arr[row][col]));
        pm.buttons[newRow][newCol].setText(String.valueOf(pm.arr[newRow][newCol]));
        pm.buttons[row][col].setClickable(false);
        pm.buttons[newRow][newCol].setClickable(true);

        //setting the correct colors
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                pm.buttons[i][j].setBackgroundColor(Color.RED);
                if(pm.buttons[i][j].getText().equals(String.valueOf(pm.check[i][j]))){
                    pm.buttons[i][j].setBackgroundColor(Color.GREEN);
                }
            }
        }
    }
}
