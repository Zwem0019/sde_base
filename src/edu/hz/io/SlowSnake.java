package edu.hz.io;

public class SlowSnake extends Snake{

    public SlowSnake(int x, int y, int length, Direction dir, int width, int height){
        super(x,y,length,dir,width,height);
        this.speed = 5;
    }
}
