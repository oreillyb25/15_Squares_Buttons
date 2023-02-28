package com.example.a15_squares_buttons;

public class PuzzleController {

    PuzzleModel pm;
    PuzzleView pv;

    public PuzzleController(PuzzleView pvo){
        pv = pvo;
        pm = pv.getPuzzleModel();
    }
}
