package edu.hz;

import edu.hz.io.*;

public class Main {

    public static void main(String[] args){
        Game Snake = Game.getInstance(new NullState());
        RunningState running = new RunningState(Snake);
        Snake.changeState(running);

        Snake.run();


    }
}
