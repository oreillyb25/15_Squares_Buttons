package com.example.a15_squares_buttons;

import android.view.View;

public class PuzzleController implements View.OnClickListener{

    private PuzzleModel pm;
    private PuzzleView pv;

    public PuzzleController(PuzzleView pvo){
        pv = pvo;
        pm = pv.getPuzzleModel();
    }

    public void onClick(View view){
        if(view.getId() == R.id.create){
            pv.drawGrid();
        }
        else{
            int row = 0;
            int col = 0;
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(view == pm.buttons[i][j]){
                        row = i;
                        col = j;
                    }
                }
            }
            if(row != 3){
                if(pm.arr[row+1][col] == 16){
                    pv.move(row, col, row+1, col);
                }
            }
            if(col != 3){
                if(pm.arr[row][col+1] == 16){
                    pv.move(row, col, row, col+1);
                }
            }
            if(row != 0){
                if(pm.arr[row-1][col] == 16){
                    pv.move(row, col, row-1, col);
                }
            }
            if(col != 0){
                if(pm.arr[row][col-1] == 16){
                    pv.move(row, col, row, col-1);
                }
            }
        }
    }
}
