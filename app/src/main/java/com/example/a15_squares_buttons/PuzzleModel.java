package com.example.a15_squares_buttons;

import android.widget.Button;

import java.util.ArrayList;

public class PuzzleModel {
/*game plan:
double int array for the sixteen squares
double int array to check the order
button array
<Integer> to shuffle values
 */
    int[][] arr = new int[4][4];
    int[][] check = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    Button[][] buttons = new Button[4][4];

    Integer[] shuf = new Integer[16];
    //List <Integer> shuffle;

}
