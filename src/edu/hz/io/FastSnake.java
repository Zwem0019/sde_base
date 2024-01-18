package edu.hz.io;

public class FastSnake extends Snake{

    public FastSnake(int x, int y, int length, Direction dir, int width, int height){
        super(x,y,length,dir,width,height);
        this.speed = 1;
    }

}
